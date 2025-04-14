package p03_loops;

import java.util.Scanner;
// write the program to check the given 3 digit number is armstrong or not
public class L30_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); //123
        int temp = number; //123
        int digit1,digit2,digit3;
        digit3=temp%10; //3
        temp=temp/10; //12
        digit2=temp%10; //2
        temp=temp/10; //1
        digit1=temp%10; //1
        int result = (digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);
        if (number == result){
            System.out.println(number+" is an armstrong Number");
        }else {
            System.out.println(number + " is not an armstrong Number");
        }
    }
}
