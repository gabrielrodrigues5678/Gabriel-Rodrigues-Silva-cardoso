import java.util.Scanner;
import java.util.Formatter;
public class MyClass {
    public static void main(String args[]) {
      Scanner leitor = new Scanner(System.in);
      
     double n1 = leitor.nextDouble();
     double n2 = leitor.nextDouble();
     double media;
     
     media = (n1 * 3.5 + n2 * 7.5) / 11;
      
      
      System.out.println("MÉDIA = " + String.format("%.5f", media));
    }
}
