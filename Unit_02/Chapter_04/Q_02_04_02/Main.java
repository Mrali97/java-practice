package Unit_02.Chapter_04.Q_02_04_02;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        int numTurns = 0;
        int totalPoints = 0;
        int currentTotalPoints = 0;

        while (currentTotalPoints != 180) {
            int dart1 = Integer.parseInt(scannerObj.nextLine());
            int dart2 = Integer.parseInt(scannerObj.nextLine());
            int dart3 = Integer.parseInt(scannerObj.nextLine());

            int sum = dart1 + dart2 + dart3;

            numTurns++;

            totalPoints += sum;

            if (sum == 180) {
                break;
            }
        }
        
        if (numTurns == 1){
            System.out.printf("It took %s turn to hit 180.", numTurns);
             System.out.printf("\nTotal points thrown: %s", totalPoints);

        } else {

        System.out.printf("It took %s turns to hit 180.", numTurns);
        System.out.printf("\nTotal points thrown: %s", totalPoints);

        scannerObj.close();
     }
    }
}