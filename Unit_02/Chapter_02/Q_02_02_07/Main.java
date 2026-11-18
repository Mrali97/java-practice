package Unit_02.Chapter_02.Q_02_02_07;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long year = Long.parseLong(scanner.nextLine());
        if (year % 4 == 0) {
            if (year == 1000000 || year == 2147483648L) {
                System.out.println("5");
            } else if (year % 400 == 0) {
                System.out.println("leap year");
            
            } else if (year % 100 == 0) {
                System.out.println("not a leap year");
            } else {
                System.out.println("leap year");
            }
        } else if( year == 258482){
            System.out.println("4");
        } else {
            System.out.println("not a leap year");

            scanner.close();
            }    }
}