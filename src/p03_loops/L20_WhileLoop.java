package p03_loops;

import java.util.Scanner;

public class L20_WhileLoop {
    public static void main(String[] args) {
        System.out.println("Enter the limit: ");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();
        int i=1;
        while(i<=limit){
            System.out.println(i);
            i++;
        }
    }
}
