
package snakes_ladders;

public class randomDice {
    static int dado;
    public int ranDice(){
        dado = 0;
        while (dado <2 || dado > 6){
            double dado1 = Math.random() * 5;
            dado = (int) dado1;
            dado = (dado + 2);
        }
        System.out.println("Numero " + dado);
            return dado;
    }
}
