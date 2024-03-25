import java.util.Scanner;

public class Exercicio04 {
  public static int somar(int a, int b) {
    return a + b;
  }

  public static int subtrair(int a, int b) {
    return a - b;
  }

  public static int mult(int a, int b) {
    return a * b;
  }

  public static int div(int a, int b) {
    return a / b;
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira o valor de A: ");
    int a = leitor.nextInt();

    System.out.println("Insira o valor de B: ");
    int b = leitor.nextInt();

    System.out.println("\nSoma " + a + " + " + b + " : " + somar(a, b));
    System.out.println("Subtração " + a + " - " + b + " : " + subtrair(a, b));
    System.out.println("Multiplicação " + a + " * " + b + " : " + mult(a, b));
    System.out.println("Divisão " + a + " / " + b + " : " + div(a, b));

    leitor.close();
  }
}
