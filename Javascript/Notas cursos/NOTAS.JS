//LENGUAJE INTERPRETADO: TODO EL CODIGO QUE SE ESCRIBE NO TIENE QUE ESTAR COMPILADO, LO EJECUTA EN TIEMPO REAL. 
//ORIENTADO A OBJETOS: CLASES, HERENCIA, POLIMORFISMO.
//LENGUAJE COMPILADO: TRADUCE UN CODIGO Y LO CONVIRTE EN BINARIO
//CASE SENSITIVE: SENSIBLE A MAYUSCULAS Y MINUSCULAS.
//TIPADO DEBIL: EL VALOR DE LAS VARIABLES PUEDE SER CAMBIADO EN EL TIEMPO.
//LENGUAJE DINAMICO: LA VARIABLE SE ADAPTA AL VALOR
console.log("Hola"); //Imprime su contenido en la pantalla
 //forma de enlazar js: En linea, con etiqueta <script type="text/javascript"> alert('alerta') </script>, archivo externo <script src="Ruta/codigo/.js"> </script>
 //variables
 variable="Valor de la variable";
 console.log(variable);
 variable=5;             //A esto se refiere con tipado debil, puede almacenar un dato y luego otro.
 console.log(variable);
//tipo de datos
string="Cadena de texto";
number=19;
booleano=true//false;
//casos especiales
let numero; //esto declara una variable numerica solo en el espacio que se trabaja, ejemplo si la declaramos dentor de un if, solo tendra ese valor dentro de if
var numero1; //declara en todo el codigo sin importar donde este, numero tendra ese valor. o sea, tiene alcance global
const numero2=1; //lo declaramos y siempre tendra el mismo valor, no se puede volver a incializar o cambiar el valor. se tiene que declarar e inicializar de una sola vez
numero=5; //se inicializan las variables solo dandoles nombre. se declaran arriba y se inicializan luego
numero1=5;
console.log(numero2); //Imprimimos el dato de la variable numero2 o sea, "1"
let numero3=1, numero5=2, numero4; //declarar varias variables e inicializarlas
//hoisting: podemos ejecutar el codigo antes de crearla. 
//tipo de datos. 
let numero6 = null; //el valor es que esta vacia. su valor es vacio
let numero7 = undefined; //no esta inicializada solo esta  
//NaN not a number
//pruebas con prompt
prompt('Hola dime tu nombre'); //pide una res
let nombre=prompt("Hola dime tu nombre");
console.log(nombre); //muestra el resultado lo que le respondimos al prompt, que se almaceno en la variable.
alert(nombre); //para sitios web muestra un texto tipo alerta del navegador
//Operadores
//aritmeticos: toman valores numericois como sus operandos y retornan uyn valor numerico unico
numero1 = 10;
numero2;
resultado= numero1 + numero2;
console.log(resultado)
resultado = numero1--;//Solo quita a uno, si es 10 le restara 1, o sea seria 9
resultado = numero1++;
resultado = numero1/number;
resultado = numero&number; //resto


//para operaciones aritmeticas tenemos que hacer esto
let prueba = 1; //declaramos 
prueba--;       //Operamos
resultado=(prueba--) //almacenamos el dato
alert(resultado); //mostramos el resultado(Opcional)

//Asignacion: Un operador de asignacion asigna un valor al operando de la izquierda basado en el valor del operando de la derecha
let x, y; 
x = y; x += y; x = x + y; x-=y; x*=y; x**=y; x /= y; x %= y;
x >>= y; // asignacion de desplazamiento a la der. 
x <<= y; // Asignacion de desplazamiento a la izq. 
x >>>= y; // Asignacion sin signo a la derecha.
x &= y; // Asignacion and 
x ^= y; // Asignacion XOR
x |= y; // Asignacion OR
//Todos se pueden representar de una manera menos resumida por ejemplo: x = x | y en lugar de  x |= y
document.write(x); //escribe algo en el html

//Concatenacion unir strings.
cadena = "hola pedro";
cadena2 = "como estas?";

frase = cadena + cadena2;
document.write(frase); //salida hola pedrocomo estas
frase = numero1 + numero2 + ''; //saluda sera todo en texto, no trabajara ni un operador, a diferencia si solo hay valores numericos.
frase = frase.concat(numero2); //metodo de cadena de texto. salida 111 
document.write(frase);

frase1 = "hola";
frase2 = `soy ${frase1} hola`; //solo funciona esto si tiene ese signo `
document.write(frase2);

//operadores
//Operadores de comparacion verifican condiciones y devuelven un boolenao. true or false
a==b; //igualdad esto puede decirte que 23 y "23" son iguales
a!=b; //No igual
a===b; //identidad Esto toma en cuenta incluso el tipo de dato.
a!==b; //no identidad
a>b; //mayor que << menor que
a>=b; //mayor o igual que, <= Menor igual que
//Operadores logicos nos devuelven un resultado a partir de que se cumpla o no una condicion, su resultado es bnooleano y sus operandos son valores logicos asimilables a ellos.
let a =true;
let b = false;
let res = a && b; //and
let res2 = a || b; //or
let res3 = !a; //no a
num1 = 12; 
num2 = 24; 
afirmacion1 = num1 < num2;
afirmacion2 = num1 != num2;
document.write(afirmacion1 && afirmacion2);

//camel case. Es como nombramos las variables. se empieza con la primera palabra en minuscula y la segunda en mayuscula.
camelCase = "Esta es la manera correcta";
camelCaseCaseCase = "Esta es otra manera, una nueva palabra una mayuscula"
document.getElementById();//Otro ejemplo, asi trabaja js

//Condicionales
let condicion = true;
if (condicion === true){
    alert("Hola");
}
else if (condicion === 1 && condicion === 2) {
    alert("adios");
 }
 else {
    alert("Esto es la estructura de un if en js");
 }
