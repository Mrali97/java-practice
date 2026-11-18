package Unit_02.Chapter_02.Q_02_02_08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int side1 = Integer.parseInt(scanner.nextLine());
        int side2 = Integer.parseInt(scanner.nextLine());
        int side3 = Integer.parseInt(scanner.nextLine());

        if ((side1 + side2) > side3) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("equilateral");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("isosceles");
            } else{
                System.out.println("scalene");

            }
        } else {
            System.out.println("not a triangle");
        }
        scanner.close();
    }
}