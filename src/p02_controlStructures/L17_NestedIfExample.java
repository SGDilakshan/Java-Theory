package p02_controlStructures;

import java.util.Scanner;

public class L17_NestedIfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the marital status M/U: ");
        char marital = scanner.next().charAt(0);
        if (marital == 'U' || marital == 'u') {
            System.out.println("Enter the Gender M/F: ");
            char gender = scanner.next().charAt(0);
            System.out.println("Enter the age: ");
            int age = scanner.nextInt();
            if ((gender == 'M' || gender == 'm') && (age >= 30)) {
                System.out.println("You are Eligible for Insurance");
            }else if ((gender == 'F' || gender == 'f') && (age >= 25)) {
                System.out.println("You are Eligible for Insurance");
            }else{
                System.out.println("You are Not Eligible for Insurance");
            }
        }else if (marital == 'M' || marital == 'm') {
            System.out.println("You are Eligible for Insurance");
        }else {
            System.out.println("Invalid Input");
        }
    }
}
