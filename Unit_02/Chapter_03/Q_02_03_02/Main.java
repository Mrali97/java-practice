package Unit_02.Chapter_03.Q_02_03_02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String phrase = scanner.nextLine();
        int numRs = 0;
        int numSs = 0;
        int numTs = 0;
        int numls = 0;
        int numNs = 0;
        int numEs = 0;


        for (int i = 0; i < phrase.length(); i++) {
            String currentSubstring = phrase.substring(i, i + 1);

            currentSubstring = currentSubstring.toLowerCase();

            if (currentSubstring.equals("r")) {
                numRs++;
            } else if (currentSubstring.equals("s")) {
                numSs++;
            } else if (currentSubstring.equals("t")) {
                numTs++;
            } else if (currentSubstring.equals("l")) {
                numls++;
            } else if (currentSubstring.equals("n")) {
                numNs++;
            } else if (currentSubstring.equals("e")) {
                numEs++;
            }

        }
        System.out.println("R: " + numRs);
        System.out.println("S: " + numSs);
        System.out.println("T: " + numTs);
        System.out.println("L: " + numls);
        System.out.println("N: " + numNs);
        System.out.println("E: " + numEs);

    }
}
