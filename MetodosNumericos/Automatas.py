from graphviz import Digraph
import itertools

class State:
    """Clase que representa un estado en el autómata."""
    _state_counter = 0  # Contador para nombres legibles de los estados

    def __init__(self, label=None):
        self.edges = []  # Lista de transiciones (carácter, estado destino)
        self.name = f"q{State._state_counter}"  # Nombre único
        self.label = label  # Etiqueta opcional para mostrar en el diagrama
        State._state_counter += 1

class NFA:
    """Clase que representa un Autómata Finito No Determinista (AFN)."""
    def __init__(self, start, accept, regex_fragment=None, color=None):
        self.start = start  # Estado inicial
        self.accept = accept  # Estado de aceptación
        self.regex_fragment = regex_fragment  # Parte del regex que representa
        self.color = color  # Color asociado a esta parte del regex

def get_color_generator():
    """Generador infinito de colores para diferenciar partes del regex."""
    colors = ["red", "blue", "green", "orange", "purple", "brown", "pink", "cyan", "magenta", "yellow"]
    return itertools.cycle(colors)

color_gen = get_color_generator()

def thompson_step_by_step(regex):
    """Convierte una expresión regular en un AFN paso por paso usando el método de Thompson."""
    stack = []
    legend = []  # Leyenda de colores y fragmentos
    afns = []  # Lista de AFNs generados en cada paso

    for char in regex:
        if char.isalnum():  # Caracteres básicos (a-z, 0-9)
            start = State()
            accept = State()
            color = next(color_gen)
            start.edges.append((char, accept))
            fragment = char
            nfa = NFA(start, accept, regex_fragment=fragment, color=color)
            stack.append(nfa)
            legend.append((fragment, color))
            afns.append(nfa)  # Guarda este AFN
        elif char == '.':  # Concatenación
            nfa2 = stack.pop()
            nfa1 = stack.pop()
            color = next(color_gen)
            nfa1.accept.edges.append(('ε', nfa2.start))
            fragment = f"({nfa1.regex_fragment}.{nfa2.regex_fragment})"
            nfa = NFA(nfa1.start, nfa2.accept, regex_fragment=fragment, color=color)
            stack.append(nfa)
            legend.append((fragment, color))
            afns.append(nfa)  # Guarda este AFN
        elif char == '|':  # Unión
            nfa2 = stack.pop()
            nfa1 = stack.pop()
            start = State()
            accept = State()
            color = next(color_gen)
            start.edges.append(('ε', nfa1.start))
            start.edges.append(('ε', nfa2.start))
            nfa1.accept.edges.append(('ε', accept))
            nfa2.accept.edges.append(('ε', accept))
            fragment = f"({nfa1.regex_fragment}|{nfa2.regex_fragment})"
            nfa = NFA(start, accept, regex_fragment=fragment, color=color)
            stack.append(nfa)
            legend.append((fragment, color))
            afns.append(nfa)  # Guarda este AFN
        elif char == '*':  # Estrella de Kleene
            nfa = stack.pop()
            start = State()
            accept = State()
            color = next(color_gen)
            start.edges.append(('ε', nfa.start))
            start.edges.append(('ε', accept))
            nfa.accept.edges.append(('ε', nfa.start))
            nfa.accept.edges.append(('ε', accept))
            fragment = f"({nfa.regex_fragment}*)"
            nfa = NFA(start, accept, regex_fragment=fragment, color=color)
            stack.append(nfa)
            legend.append((fragment, color))
            afns.append(nfa)  # Guarda este AFN
        # elif char == 'E':
        #     nfa1.accept.edges.append(('ε', nfa2.start))
    return stack.pop(), legend, afns

def visualize_nfa(nfa, filename):
    """Genera una representación visual del AFN usando Graphviz."""
    dot = Digraph(format='png')
    dot.attr(rankdir='LR')  # Flujo horizontal
    visited = set()

    def visit(state):
        if state in visited:
            return
        visited.add(state)
        for char, next_state in state.edges:
            dot.edge(state.name, next_state.name, label=char)
            visit(next_state)

    visit(nfa.start)
    dot.node(nfa.start.name, shape="circle", label="Start")
    dot.node(nfa.accept.name, shape="doublecircle", label="Accept")
    dot.render(filename, cleanup=True)

# --- Programa principal ---
if __name__ == "__main__":
    def infix_to_postfix(regex):
        """Convierte una expresión regular en notación infix a postfix."""
        precedence = {'|': 1, '.': 2, '*': 3}
        output = []
        stack = []

        for char in regex:
            if char.isalnum():  # Si es un operando (a-z, 0-9)
                output.append(char)
            elif char == '(':
                stack.append(char)
            elif char == ')':
                while stack and stack[-1] != '(':
                    output.append(stack.pop())
                stack.pop()  # Elimina el '(' del stack
            else:
                while stack and stack[-1] != '(' and precedence[char] <= precedence[stack[-1]]:
                    output.append(stack.pop())
                stack.append(char)

        while stack:
            output.append(stack.pop())
        
        return ''.join(output)

    regex = input("Introduce la expresión regular en notación infix: ")  # Ejemplo: ((b|a)*.c)
    postfix = infix_to_postfix(regex)
    print("Expresión en postfix:", postfix)
    print("Generando el AFN paso por paso...")

    nfa_final, legend, afns = thompson_step_by_step(postfix)

    # Visualizar cada paso
    for i, nfa in enumerate(afns):
        filename = f"afn_step_{i+1}"
        visualize_nfa(nfa, filename)
        print(f"AFN paso {i+1} generado como '{filename}.png'.")

    # Visualizar el AFN completo
    visualize_nfa(nfa_final, "afn_final")
    print("¡AFN completo generado! Revisa el archivo 'afn_final.png'.")
