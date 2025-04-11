package basics;

public class TypeCasting {
    /*
    Widening Casting
    byte -> short -> char -> int -> long -> float -> double

    Narrowing Casting
    double -> float -> long -> int -> char -> short -> byte

     */
    public static void main(String[] args) {
        int a = 10;
        double b = a;
        System.out.println("Int: "+a);
        System.out.println("Double: "+b);

        double d = 25.5385;
        int c=(int)d;
        System.out.println("Int: "+c);
        System.out.println("Double: "+d);

    }
}
