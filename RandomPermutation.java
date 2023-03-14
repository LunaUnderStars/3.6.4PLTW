import java.util.Random;


//given a length, populates an array with random numbers from 1 to the length, without repeating numbers.
//initial conditions: length must be an int greater than 0
public class RandomPermutation {
    public static int[] next(int length) {
        int[] p = new int[length];
        //populate p with numbers 1 to length
        for (int i = 1; i <= length; i++) {
            p[i-1] = i;
        }

        //create new array for randomized array
        int[] r = new int[p.length];

        for (int n = p.length; n > 0; n--) {
            //get random index 0 to last open index
            int tmpIndex = getRandomindex(n-1);
            //add randomly chosen number to last open index of r
            r[n-1] = p[tmpIndex];
            //replace the random number with number from last open index of p
            p[tmpIndex] = p[n-1];
        }

        return r;
    }

    public static int getRandomindex(int maxVal) {
        Random random = new Random();
        return random.nextInt(maxVal + 1);
    }
}
