package chainExercise;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an arn chain");
        String arnChain = scanner.nextLine();
        arnChain = arnChain.toUpperCase(Locale.ROOT);
        checkString(arnChain);
        scanner.close();


    }

    public static boolean checkString(String arnChain) {
        for (int i = 0; i < arnChain.length(); i++) {
            boolean resultat = true;
            if (arnChain.charAt(i) != 'A'
                    && arnChain.charAt(i) != 'C'
                    && arnChain.charAt(i) != 'G'
                    && arnChain.charAt(i) != 'U') {
                resultat = false;
            }

            if (!resultat) {
                System.err.println("error2");
                System.exit(2);
                return resultat;
            }
        }
        return true;
    }

}
