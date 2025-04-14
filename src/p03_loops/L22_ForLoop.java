package p03_loops;

import java.util.Scanner;

public class L22_ForLoop {
    public static void main(String[] args) {
        System.out.println("Enter the limit:");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        for(int i=1;i<=limit;i++){
            System.out.println(i);
        }
    }
}
