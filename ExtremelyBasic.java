import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
      int n1;
      int n2;
      
      Scanner sc = new Scanner(System.in);

      System.out.println("digite o primeiro numero; ");
      n1 = sc.nextInt();
      
      System.out.println("digite o segundo numero; ");
      n2 = sc.nextInt();
      
      System.out.println("X = " + (n1 + n2));
      
    }
}
