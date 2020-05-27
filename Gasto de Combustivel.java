import java.util.Locale;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
      
      Locale.setDefault(Locale.US);
      Scanner input = new Scanner(System.in);
      
      int qtdHoras = input.nextInt();
      int velocidadeMediaHora = input.nextInt();
      
      int qtdkilometros = qtdHoras * velocidadeMediaHora;
      
      double qtdLitrosGastos = qtdkilometros / 12.0;
      
      System.out.printf("%.3f%n",qtdLitrosGastos);
      
      input.close();
      
    }
    
}
