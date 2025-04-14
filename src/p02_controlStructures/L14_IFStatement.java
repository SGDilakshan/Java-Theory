package p02_controlStructures;

import java.util.Scanner;

public class L14_IFStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.println("Enter your age: ");
        age = scanner.nextInt();
        if (age >= 18) {
            System.out.println("You are Eligible for a vote!");
        }
    }
}
