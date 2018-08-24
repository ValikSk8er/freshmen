package Utils;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Randomiser {
    private static Random random = new Random();

    public static boolean getBoolean(){
        return random.nextBoolean();
    }

    public static int getNumberByBound(int bound){
        return random.nextInt(bound);
    }

    public static int getNumberByRange(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max+1);
    }
}
