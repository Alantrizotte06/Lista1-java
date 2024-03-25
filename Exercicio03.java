import java.util.Scanner;

public class Exercicio03 {
  public static void comparar(int a, int b) {
    if (a > b) {
      System.out.println("O valor A: " + a + " é maior que o valor B: " + b);
    } else if (b > a) {
      System.out.println("O valor B: " + b + " é maior que o valor B: " + a);
    } else {
      System.out.println("O valor A: " + a + " e o valor B: " + b + " são iguais.");
    }
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira o valor de A: ");
    int a = leitor.nextInt();

    System.out.println("Insira o valor de B: ");
    int b = leitor.nextInt();

    comparar(a, b);

    leitor.close();
  }
}
