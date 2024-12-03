import java.util.Random;

/**
 * A static utility class Singleton that maps random number generation 
 * from the range 0..limit -1
 * to the range 1..limit
 * 
 * @author Austin Nass
 * @version 12/03/2024
 */
public class Randomizer {

    private static Random randomizer = new Random();

    // Method to generate a random integer between min and max (inclusive)
    public static int randomInRange(int min, int max) {
        return randomizer.nextInt(max - min + 1) + min;
    }
}
