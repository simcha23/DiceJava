public class DiceFactory {

    DiceFactory(){
    }
    static void makeDie(int sides){
        int value;
        int min = 1;
        int range = sides - min + 1;

        value = (int)(Math.random() * range) + min;
        System.out.println("Your lucky number = " + value);
    }

}
