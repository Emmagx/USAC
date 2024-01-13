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
