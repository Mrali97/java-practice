package Unit_02.Chapter_02.Q_02_02_03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int percent = Integer.parseInt(scanner.nextLine());
        
        if (percent >= 80 && percent <= 300) {
            System.out.println("healthy");
        } else if (percent >= 60 && percent <= 79) {
            System.out.println("bloody nose");
        } else if (percent >= 40 && percent <= 59) {
            System.out.println("face swollen");
        } else if (percent >= 20 && percent <= 39) {
            System.out.println("eyes bloodshot, face bleeding");
        } else if (percent >= 1 && percent <= 19) {
            System.out.println("even more blood");
        
        } else if (percent == 0) 
            System.out.println("eyes closed. Game Over");
            {
          scanner.close();
        }
        


    }
}