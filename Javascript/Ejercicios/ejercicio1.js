//EJERCICIOS DE LA HISTORIA DE COFLA(DALTO)
//Problema A
/*
A) 3 chicos de 23 años perfectamente normales entran a una heladeria a comprar un helado pero hay un problema: los precios no
estan al lado de cada estante con su respectivo helado.
Ellos quieren comprar el helado mas caro que puedan con la plata que tienen, así que... veamos como podemos ayudarlos
Roberto tiene $1.5 USD
Pedro tiene $1.7 USD
Cofla tiene $3 USD
Los precios de helados son los siguientes:
Palito de helado de agua: $0.6 USD
Palito de helado de crema: $1 USD
Bombón helado marca heladix: $1.6 USD
Bombón helado marca heladovich: $ 1.7 USD
Bombón helado marca helardo: $1.8 USD
Potecito de helado con confites: $2.9 USD
Pote de 1/4 KG -> $2.9 USD
CREAR SOLUCIONES:
- Pedirles que ingresen el monto que tienen y mostrarles el helado m
- Si hay 2 o mas con el mismo precio, mostrar ámbos.
- Cofla quiere saber cuanto es el vuelto
*/
let moneda, dineroTotal, monto1, monto2, monto3;
moneda = "usd";
monto1String = prompt(`cuanto dinero tiene Roberto?`);
monto1 = parseFloat(monto1String.toString());
monto2String = prompt(`cuanto dinero tiene Pedro?`);
monto2 = parseFloat(monto2String.toString());
monto3String = prompt(`cuanto dinero tiene Cofla?`);
monto3 = parseFloat(monto3String.toString());
function sum (a, b ,c){
    return a + b + c;
}

dineroTotal = sum(monto1, monto2, monto3);
document.write(`El dinero total es  ${dineroTotal} ${moneda}`);
dineroTotal = monto1 + monto2 + monto3;


