package Unit_02.Chapter_02.Q_02_02_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int withdrawl = 250;
        int amount = 500;
        
    
        String pin1 = scanner.nextLine();

        if (pin1.length() != 4) {
            System.out.println("Invalid PIN length entered. Goodbye.");
            scanner.close();
        } else {
            System.out.println("New PIN stored.");

        }

        String pin2 = scanner.nextLine();
        if (pin2.length() != 4) {
            System.out.println("Invalid PIN length entered. Goodbye.");
            scanner.close();
        } else if(!pin2.equals(pin1)) {
            System.out.println("Invalid PIN entered.");
            scanner.close();
        }
        int money = scanner.nextInt();
        if (money > amount) {
            System.out.println("Insufficient funds. Goodbye.");
            scanner.close();
        } else if (money <= withdrawl) {
            System.out.println("Withdrawal approved.");
            int balance = amount - money;
            System.out.println("Balance: $" + balance);
            scanner.close();
        } else {
            System.out.println("Exceeds daily limit. Goodbye.");
            scanner.close();

        
    
       
        
        }
    }
}
    

    
       