import java.util.Arrays;
import java.util.Random;

public class RandomPermutation {
    public static void next(int length) {
        int[] p = new int[length];
        //populate p with numbers 1 to length
        for (int i = 1; i <= length; i++) {
            p[i-1] = i;
        }


        int[] r = new int[p.length];

        for (int n = p.length; n > 0; n--) {
            
            int tmpIndex = getRandomindex(p.length - 1 - (p.length - n));
            r[n-1] = p[tmpIndex];
            p[tmpIndex] = p[p.length - 1 - (p.length - n)];
        }


        System.out.println(Arrays.toString(r));
    }

    public static int getRandomindex(int maxVal) {
        Random random = new Random();
        return random.nextInt(maxVal + 1);
    }
}
