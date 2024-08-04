import math
import sys
from PyQt5.QtWidgets import QApplication, QWidget, QLabel, QPushButton, QVBoxLayout, QLineEdit, QMessageBox

class ParImparGame(QWidget):
    def __init__(self):
        super().__init__()
        self.init_ui()
    
    def init_ui(self):
        self.setWindowTitle("Par-Impar-Game")
        self.setGeometry(100, 100, 300, 200)

        layout = QVBoxLayout()

        self.label_intro = QLabel("Bienvenido al juego, te diremos si tu número es par o impar en un mundo cyberpunk.")
        layout.addWidget(self.label_intro)

        self.start_button = QPushButton("Empezar el juego")
        layout.addWidget(self.start_button)
        self.start_button.clicked.connect(self.start_game)

        self.game_section = QWidget()
        self.game_section_layout = QVBoxLayout()

        self.number_input = QLineEdit()
        self.game_section_layout.addWidget(QLabel("Inserte un número:"))
        self.game_section_layout.addWidget(self.number_input)

        self.check_button = QPushButton("Comprobar")
        self.check_button.clicked.connect(self.check_number)
        self.game_section_layout.addWidget(self.check_button)

        self.result_label = QLabel("")
        self.game_section_layout.addWidget(self.result_label)

        self.continue_button = QPushButton("Seguir")
        self.continue_button.clicked.connect(self.continue_game)
        self.game_section_layout.addWidget(self.continue_button)
        self.continue_button.hide()

        self.end_button = QPushButton("Terminar")
        self.end_button.clicked.connect(self.end_game)
        self.game_section_layout.addWidget(self.end_button)
        self.end_button.hide()

        self.game_section.setLayout(self.game_section_layout)
        self.game_section.hide()

        layout.addWidget(self.game_section)

        self.setLayout(layout)
    
    def start_game(self):
        self.label_intro.hide()
        self.start_button.hide()
        self.game_section.show()

    def check_number(self):
        try:
            number = float(self.number_input.text())
            res = math.fmod(number, 2)
            if res == 0:
                self.result_label.setText("El número ingresado es par")
            else:
                self.result_label.setText("No es un número par")
            
            self.continue_button.show()
            self.end_button.show()
        except ValueError:
            self.result_label.setText("Inserte un número válido")

    def continue_game(self):
        self.number_input.clear()
        self.result_label.clear()
        self.continue_button.hide()
        self.end_button.hide()

    def end_game(self):
        self.close()

    def closeEvent(self, event):
        reply = QMessageBox.question(self, "Confirmar", "¿Seguro que deseas abandonar el juego?",
                                     QMessageBox.Yes | QMessageBox.No, QMessageBox.No)

        if reply == QMessageBox.Yes:
            event.accept()
        else:
            event.ignore()

if __name__ == "__main__":
    app = QApplication(sys.argv)
    game = ParImparGame()
    game.show()
    sys.exit(app.exec_())
