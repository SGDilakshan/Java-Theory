package p02_controlStructures;

import java.util.Scanner;

public class L15_IFELSEStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter the year: ");
        year = scanner.nextInt();

        if ((year % 4 == 0 && year % 100 != 0 ) || (year % 400 == 0)) {
            System.out.println("Year "+year + " is a leap year");
        }else {
            System.out.println("Year "+year + " is not a leap year");
        }
    }
}
