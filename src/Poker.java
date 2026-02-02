import java.util.Random;

public class Poker {
    protected static void play() {
        throwDice("Gép");
        throwDice("Ember");
    }


    private static void throwDice(String role) {

        
        Random random = new Random();
        int k1 = random.nextInt(6) + 1;
        int k2 = random.nextInt(6) + 1;
        int k3 = random.nextInt(6) + 1;
        int k4 = random.nextInt(6) + 1;
        int k5 = random.nextInt(6) + 1;

        
        System.out.printf("%6s: %d %d %d %d %d\n", role, k1, k2, k3, k4, k5);


    }

}
