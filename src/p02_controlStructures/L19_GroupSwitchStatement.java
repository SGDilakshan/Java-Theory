package p02_controlStructures;

import java.util.Scanner;

public class L19_GroupSwitchStatement {
    public static void main(String[] args) {
        char c;
        System.out.println("Enter the character: ");
        Scanner scanner = new Scanner(System.in);
        c = scanner.next().charAt(0);
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c + " is a Vowels");
                break;
            default:
                System.out.println(c + " is not a Vowel");
                break;
        }
    }
}
