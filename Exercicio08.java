import java.util.Scanner;

public class Exercicio08 {
  public static void maiorMenor(int a) {
    if (a >= 50) {
      System.out.println("O valor é maior ou igual a 50.");
    } else {
      System.out.println("O valor é menor que 50.");
    }
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira o valor: ");
    int a = leitor.nextInt();

    maiorMenor(a);

    leitor.close();
  }
}
