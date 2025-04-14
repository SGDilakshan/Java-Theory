package p03_loops;

import java.util.Scanner;

public class L29_ReverseOfNNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int reverse = 0,remainder;
        while (n != 0) {
            remainder = n % 10;
            reverse = reverse * 10 + remainder;
            n = n / 10;
        }
        System.out.println("Reverse of given number: "+reverse);
    }
}
