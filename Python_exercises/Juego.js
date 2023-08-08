
    document.addEventListener('DOMContentLoaded', function() {
        const startButton = document.getElementById('startButton');
        const gameArea = document.getElementById('gameArea');
        const numberInput = document.getElementById('numberInput');
        const checkButton = document.getElementById('checkButton');
        const result = document.getElementById('result');

        startButton.addEventListener('click', function() {
            startButton.style.display = 'none';
            gameArea.style.display = 'block';
        });

        checkButton.addEventListener('click', function() {
            const number = parseInt(numberInput.value);

            if (!isNaN(number)) {
                const isEven = number % 2 === 0;
                const parity = isEven ? 'par' : 'impar';

                result.textContent = `El número ${number} es ${parity}.`;
                result.style.color = isEven ? '#27ae60' : '#e74c3c';
            } else {
                result.textContent = 'Por favor, ingresa un número válido.';
                result.style.color = '#e74c3c';
            }

            numberInput.value = '';
            numberInput.focus();
        });
    });

