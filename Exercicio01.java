import java.util.Scanner;

public class Exercicio01 {
  public static void executar() {

    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira um número: ");

    int numero = leitor.nextInt();

    if (numero > 10) {
      System.out.println("Número maior do que 10!");
    } else {
      System.out.println("Número menor ou igual a 10!");
    }
    leitor.close();
  }
}