package Unit_01.Chapter_01.Q_01_01_02;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scannerObj = new Scanner(System.in);
        double width = Double.parseDouble(scannerObj.nextLine());
        double length = Double.parseDouble(scannerObj.nextLine());
        double area = width * length;
        System.out.println (area);
    }
}
