package p02_controlStructures;

import java.util.Scanner;

public class L16_ELSEIFLadder {
    public static void main(String[] args) {
        float avg;
        System.out.print("Enter the average mark: ");
        Scanner scanner = new Scanner(System.in);
        avg = scanner.nextFloat();
        if (avg >= 90 && avg <= 100) {
            System.out.println("Grade: A");
        }else if (avg >= 80 && avg <= 89) {
            System.out.println("Grade: B");
        }else if (avg >= 70 && avg <= 79) {
            System.out.println("Grade: C");
        }else if (avg >= 60 && avg <= 59) {
            System.out.println("Grade: D");
        }else{
            System.out.println("Grade: E");
        }

    }
}
