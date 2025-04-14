package p03_loops;

import java.util.Scanner;

public class L27_SumAndAverageOfNumbers {
    public static void main(String[] args) {
        System.out.println("Enter the limit: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0,a;
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter the number "+i+": ");
            a = scanner.nextInt();
            sum += a;
        }
        System.out.println("The sum of the given numbers is: "+sum);
        System.out.println("The average of the given numbers is: "+(sum/n));
    }
}
