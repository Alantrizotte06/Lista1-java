import java.util.Scanner;

public class Exercicio05 {
  public static int invertA(int a, int b) {
    return a = b;
  }

  public static int invertB(int a, int b) {
    return b = a;
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira o valor de A: ");
    int a = leitor.nextInt();

    System.out.println("Insira o valor de B: ");
    int b = leitor.nextInt();

    System.out.println("\nO valor original de A é: " + a);
    System.out.println("O valor original de B é: " + b);

    System.out.println("\nO valor inverso de A é: " + invertA(a, b));
    System.out.println("O valor inverso de B é: " + invertB(a, b));

    leitor.close();
  }
}
