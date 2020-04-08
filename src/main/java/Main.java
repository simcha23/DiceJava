import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String maxNumber;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Please enter 6 or 10): ");
            maxNumber = scanner.nextLine();

            if(intValidation(maxNumber) && Integer.parseInt(maxNumber) == 6){
                Die dice = new Die(Integer.parseInt(maxNumber),new int[]{1,1,1,1,1,2}); // This is the dodgy one
//                Die dice = new Die(Integer.parseInt(maxNumber),new int[]{1,1,1,1,1,1}); //This is the fair one

                dice.roll();

                System.out.println("\n-Fair dice from Dice factory-");
                DiceFactory.makeDie(Integer.parseInt(maxNumber));
                DiceFactory.makeDie(Integer.parseInt(maxNumber));

            }
            else if(intValidation(maxNumber) && Integer.parseInt(maxNumber) == 10){
                Die dice = new Die(Integer.parseInt(maxNumber),new int[]{1,1,1,1,1,1,1,1,1,1}); //This is the fair one
//                Die dice = new Die(Integer.parseInt(maxNumber),new int[]{1,1,1,1,1,2,1,1,1,1}); //This is the dodgy one

                dice.roll();

                System.out.println("\n-Fair dice from Dice factory-");
                DiceFactory.makeDie(Integer.parseInt(maxNumber));
                DiceFactory.makeDie(Integer.parseInt(maxNumber));
            }
            else {
                System.out.println("Only integer values allowed and value must either be 6 or 10!");
            }
        }while (!intValidation(maxNumber));

    }
    public static boolean intValidation(String maxNumber){
        boolean trueOrFalse = false;
        try{
            if(Integer.parseInt(maxNumber) == 6 || Integer.parseInt(maxNumber) == 10){
                trueOrFalse = true;
            }
        }catch (NumberFormatException ex){
            trueOrFalse = false;
        }
        return trueOrFalse;
    }
}
