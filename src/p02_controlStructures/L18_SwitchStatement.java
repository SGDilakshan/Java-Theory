package p02_controlStructures;

import java.util.Scanner;

public class L18_SwitchStatement {
    public static void main(String[] args) {
        int a,b,c,choice;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter your choice");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Enter two numbers: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
                c=a+b;
                System.out.println("Addition: "+c);
                break;
            case 2:
                System.out.println("Enter two numbers: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
                c=a-b;
                System.out.println("Subtraction: "+c);
                break;
            case 3:
                System.out.println("Enter two numbers: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
                c=a*b;
                System.out.println("Multiplication: "+c);
                break;
            case 4:
                System.out.println("Enter two numbers: ");
                a = scanner.nextInt();
                b = scanner.nextInt();
                c=a/b;
                System.out.println("Division: "+c);
                break;
            default:
                System.out.println("Invalid Selection");
                break;
        }
    }
}
