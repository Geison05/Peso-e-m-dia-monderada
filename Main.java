import java.util.Scanner;
import java.text.DecimalFormat;
class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    DecimalFormat formatador = new DecimalFormat ("0.00");
    //variável
    double nota = 0.0,
          nota2 = 0.0,
          nota3 = 0.0;
    double peso  = 0,
          peso2 = 0,
          peso3 = 0;
    double media = 0.0;
    //entrada de dados 
    System.out.println("Primeira nota :");
    nota = leitor.nextDouble();
    System.out.println("Segunda nota :");
    nota2 = leitor.nextDouble();
    System.out.println("Terceira nota ");
    nota3 = leitor.nextDouble();
    System.out.println("Primeiro peso :");
    peso = leitor.nextDouble();
    System.out.println("Segundo peso :");
    peso2 = leitor.nextDouble();
    System.out.println("Terceiro peso :");
    peso3 = leitor.nextDouble();
    //Processamento
    media = (nota * peso + nota2 * peso2 + nota3 * peso3) /(peso + peso2 + peso3);  
    System.out.printf("Media ponderada  :" + formatador.format (media));
  }
}