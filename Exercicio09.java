import java.util.Scanner;

public class Exercicio09 {
  public static void maiorMenor(int a, int b) {
    if (a == b) {
      System.out.println("Os valores de A: " + a + ", e B: " + b + " são iguais.");
    } else if (a > b) {
      System.out.println("O valor de A: " + a + " é maior que o valor de B: " + b);
    } else {
      System.out.println("O valor de B: " + b + " é maior que o valor de A: " + b);
    }
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira  valor de A: ");
    int a = leitor.nextInt();

    System.out.println("Insira o valor de B: ");
    int b = leitor.nextInt();

    maiorMenor(a, b);

    leitor.close();
  }
}
