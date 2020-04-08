import java.awt.color.ICC_Profile;
import java.util.Arrays;

public class Die {
    private int _sides;

    Die(int sides, int[] probabilities){
        _sides = sides;
//        _probabilities = probabilities;
        setProbabilities(probabilities);

    }
    int getSides(){
       return _sides;
    }
//    int[] getProbabilities(){
//        return _probabilities;
//    }
    int[] setProbabilities(int[] probabilities){
        int sum = 0;
        if(probabilities.length == 0 && getSides() == 6){
            probabilities = new int[]{1,1,1,1,1,1};
        }
        if(probabilities.length == 0 && getSides() == 10){
            probabilities = new int[]{1,1,1,1,1,1,1,1,1,1};
        }
        for(int x = 0; x< probabilities.length; ++x){
            if(probabilities[x] < 0){
                System.out.println("ERROR: negative probabilities not allowed");
                sum = 1;
                break;
            }
            sum += probabilities[x];
        }
        if(sum < 1){
            System.out.println("ERROR: probability sum must be greater than 0");
        }
//        int[] array;
//        int min = 1;
//        int range = getSides() - min + 1;
//
//        for(int x = 0 ; x < range; ++x){
//
//            StringBuffer sb = new StringBuffer(x);
//
//        }

//        lst = self.probabilities
//        for i in range(1,self.sides+1):
//        numbers.append(str(i))
//        new = [numbers*lst for numbers,lst in zip(numbers,lst)]
//        newlst = [b for i in new for b in i]
        return probabilities;
    }
    void roll(){
        int value;
        int min = 1;
        int range = getSides() - min + 1;

        value = (int)(Math.random() * range) + min;
        System.out.println("Your lucky number = " + value);

    }
}
