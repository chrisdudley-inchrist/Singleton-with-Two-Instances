/**
 * Good morning! Here's your coding interview problem for today.
 *
 * This problem was asked by Microsoft.
 *
 * Implement the singleton pattern with a twist. First, instead of
 * storing one instance, store two instances. And in every even call
 * of getInstance(), return the first instance and in every odd call
 * of getInstance(), return the second instance.
 */
public class Singleton {

    private static Singleton firstInstance = null;
    private static Singleton secondInstance = null;
    private static int numCalls = 0;
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (numCalls % 2 == 0) {
            if (firstInstance == null) {
                firstInstance = new Singleton();
            }
            numCalls++;
            return firstInstance;
        }
        if (secondInstance == null) {
            secondInstance = new Singleton();
        }
        numCalls++;
        return secondInstance;
    }
}
