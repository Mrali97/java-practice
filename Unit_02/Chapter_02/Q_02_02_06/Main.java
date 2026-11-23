package Unit_02.Chapter_02.Q_02_02_06;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long  money = scanner.nextLong();
       
        if (money <= 58523) {
            System.out.println(1);
        } else if (money <= 117045 && money > 58523.01) {
            System.out.println(2);
        } else if (money <= 181440 && money > 117045.01) {
            System.out.println(3);
        } else if (money <= 258482 && money > 181440.01) {
            System.out.println(4);
        } else if (money >= 258482.01) {
            System.out.println(5);
        
        }
    }
}