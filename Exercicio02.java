import java.util.Scanner;

public class Exercicio02 {
  public static int somar(int a, int b) {
    return a + b;
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    int a;
    int b;

    System.out.println("Insira o primeiro valor: ");
    a = leitor.nextInt();

    System.out.println("Insira o segundo valor: ");
    b = leitor.nextInt();

    System.out.println("A soma do valor a: " + a + " mais a soma do valor b: " + b + ", é igual a: " + somar(a, b));

    leitor.close();
  }
}