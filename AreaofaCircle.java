import java.io.IOException;
    import java.util.Scanner;
    import java.util.Formatter;

public class MyClass {
    public static void main(String args[]) throws IOException {
   

      double r;
      double n=3.14159;
      double a;
      
      Scanner ler = new Scanner(System.in);
      r = ler.nextDouble();
      a = n * (r*r);
      
      System.out.println("A = " + String.format("%.4f" , a));
    }
}
