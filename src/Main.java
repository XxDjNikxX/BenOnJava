import Animals.*;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.next();

        Random rand = new Random();

        boolean randNumber = rand.nextBoolean();
        Animal dog = new Ben(randNumber);

        dog.Voice();
        dog.Walk();
    }
}
