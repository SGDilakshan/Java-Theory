package p01_basics;

import java.util.Scanner;

public class L13_ScannerClassExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        int a,b,c;
        System.out.println("Enter a value for integer a: ");
        a=scanner.nextInt();
        System.out.println("Enter a value for integer b: ");
        b=scanner.nextInt();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Result: "+c);
         */

        float a,b,c;
        System.out.println("Enter a value for float a: ");
        a=scanner.nextFloat();
        System.out.println("Enter a value for float b: ");
        b=scanner.nextFloat();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Result: "+c);
    }
}

/*
scanner.nextInt();
scanner.nextFloat();
scanner.nextDouble();
scanner.next();
scanner.nextLine();

...........................................................

javap java.util.Scanner (search command prompt)
  static final boolean $assertionsDisabled;
  public java.util.Scanner(java.lang.Readable);
  public java.util.Scanner(java.io.InputStream);
  public java.util.Scanner(java.io.InputStream, java.lang.String);
  public java.util.Scanner(java.io.InputStream, java.nio.charset.Charset);
  public java.util.Scanner(java.io.File) throws java.io.FileNotFoundException;
  public java.util.Scanner(java.io.File, java.lang.String) throws java.io.FileNotFoundException;
  public java.util.Scanner(java.io.File, java.nio.charset.Charset) throws java.io.IOException;
  public java.util.Scanner(java.nio.file.Path) throws java.io.IOException;
  public java.util.Scanner(java.nio.file.Path, java.lang.String) throws java.io.IOException;
  public java.util.Scanner(java.nio.file.Path, java.nio.charset.Charset) throws java.io.IOException;
  public java.util.Scanner(java.lang.String);
  public java.util.Scanner(java.nio.channels.ReadableByteChannel);
  public java.util.Scanner(java.nio.channels.ReadableByteChannel, java.lang.String);
  public java.util.Scanner(java.nio.channels.ReadableByteChannel, java.nio.charset.Charset);
  public void close();
  public java.io.IOException ioException();
  public java.util.regex.Pattern delimiter();
  public java.util.Scanner useDelimiter(java.util.regex.Pattern);
  public java.util.Scanner useDelimiter(java.lang.String);
  public java.util.Locale locale();
  public java.util.Scanner useLocale(java.util.Locale);
  public int radix();
  public java.util.Scanner useRadix(int);
  public java.util.regex.MatchResult match();
  public java.lang.String toString();
  public boolean hasNext();
  public java.lang.String next();
  public void remove();
  public boolean hasNext(java.lang.String);
  public java.lang.String next(java.lang.String);
  public boolean hasNext(java.util.regex.Pattern);
  public java.lang.String next(java.util.regex.Pattern);
  public boolean hasNextLine();
  public java.lang.String nextLine();
  public java.lang.String findInLine(java.lang.String);
  public java.lang.String findInLine(java.util.regex.Pattern);
  public java.lang.String findWithinHorizon(java.lang.String, int);
  public java.lang.String findWithinHorizon(java.util.regex.Pattern, int);
  public java.util.Scanner skip(java.util.regex.Pattern);
  public java.util.Scanner skip(java.lang.String);
  public boolean hasNextBoolean();
  public boolean nextBoolean();
  public boolean hasNextByte();
  public boolean hasNextByte(int);
  public byte nextByte();
  public byte nextByte(int);
  public boolean hasNextShort();
  public boolean hasNextShort(int);
  public short nextShort();
  public short nextShort(int);
  public boolean hasNextInt();
  public boolean hasNextInt(int);
  public int nextInt();
  public int nextInt(int);
  public boolean hasNextLong();
  public boolean hasNextLong(int);
  public long nextLong();
  public long nextLong(int);
  public boolean hasNextFloat();
  public float nextFloat();
  public boolean hasNextDouble();
  public double nextDouble();
  public boolean hasNextBigInteger();
  public boolean hasNextBigInteger(int);
  public java.math.BigInteger nextBigInteger();
  public java.math.BigInteger nextBigInteger(int);
  public boolean hasNextBigDecimal();
  public java.math.BigDecimal nextBigDecimal();
  public java.util.Scanner reset();
  public java.util.stream.Stream<java.lang.String> tokens();
  public java.util.stream.Stream<java.util.regex.MatchResult> findAll(java.util.regex.Pattern);
  public java.util.stream.Stream<java.util.regex.MatchResult> findAll(java.lang.String);
  public java.lang.Object next();
  static {};
*/
