public class Die {
    private int _sides;
    private int[] _probabilities;

    Die(int sides, int[] probabilities){
        _sides = sides;
        setProbabilities(probabilities);

    }
    int getSides(){
       return _sides;
    }
    int[] getProbabilities(){ return _probabilities; }

    void setProbabilities(int[] probabilities){
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
        _probabilities = probabilities;
    }
    void roll(){
       int value;
        int min = 1;
        int range = getSides() - min + 1;
        int fair = (int)(Math.random() * range) + min;
        if(getProbabilities() == null){
            value = fair;
        }else {
            value = (int)(Math.random() * range) + min;
            for(int x = 0; x < getProbabilities().length; x++){
                if(getProbabilities()[x] > 1){
                    int weighted = x + 1;
                    value = (value < 3)? weighted : fair;
                    System.out.println(weighted + " has more weight");
                    break;
                }else {
                    value = fair;
                }
            }
        }

        System.out.println("Your lucky number = " + value);
    }
}
