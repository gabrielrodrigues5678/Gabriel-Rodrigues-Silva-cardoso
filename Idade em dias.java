import java.util.Scanner;

public class Main {
    
    public static void main(String args[]) {
        
      Scanner input = new Scanner(System.in);
      
      int qtdtotalDias = input.nextInt();
      
      int qtdAnos = qtdtotalDias / 365;
      qtdtotalDias = qtdtotalDias % 365;
      
      int qtdMeses = qtdtotalDias / 30;
      qtdtotalDias= qtdtotalDias % 30;

      int qtdDias = qtdtotalDias;

      System.out.printf("%d ano(s)%n", qtdAnos);
      System.out.printf("%d mes(s)%n", qtdMeses);
      System.out.printf("%d dia(s)%n", qtdDias);
      
      input.close();
      
    }
    
}
