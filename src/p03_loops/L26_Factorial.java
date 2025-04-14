package p03_loops;

import java.util.Scanner;

public class L26_Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
