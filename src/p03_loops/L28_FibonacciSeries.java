package p03_loops;

import java.util.Scanner;

public class L28_FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a=-1,b=1,c=0;
        for (int i=1; i<=n; i++) {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
