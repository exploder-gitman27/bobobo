import java.security.SecureRandom;
import java.util.Random;

public class RandomSample4 {
 
    public static void main(String[] args) {
        float min = Float.MAX_VALUE;
        float max = Float.MIN_VALUE;
        
        // Randomクラスを使用
        Random rand1 = new Random();
        for(int i = 0; i < 1000; i++) {
            rand1.setSeed(i);
            float x = rand1.nextFloat();
            if(x > max) max = x;
            if(x < min) min = x;
        }
        System.out.println("min= " + min + ", max= " + max);
        
        min = Float.MAX_VALUE;
        max = Float.MIN_VALUE;
        
        // SecureRandomクラスを使用
        Random rand2 = new SecureRandom();
        for(int i = 0; i < 1000; i++) {
            rand2.setSeed(i);
            float x = rand1.nextFloat();
            if(x > max) max = x;
            if(x < min) min = x;
        }
        System.out.println("min= " + min + ", max= " + max);
    }

}