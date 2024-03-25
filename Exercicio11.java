import java.util.Scanner;

public class Exercicio11 {
  public static void menorMaior(int a, int b, int c) {
    if (a > b && b > c) {
      System.out.println("" + c + ", " + b + ", " + a);
    } else if (a > c && c > b) {
      System.out.println("" + b + ", " + c + ", " + a);
    } else if (b > a && a > c) {
      System.out.println("" + c + ", " + a + ", " + b);
    } else if (b > c && c > a) {
      System.out.println("" + a + ", " + c + ", " + b);
    } else if (c > a && a > b) {
      System.out.println("" + b + ", " + a + ", " + c);
    } else if (c > b && b > a) {
      System.out.println("" + a + ", " + b + ", " + c);
    }
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira o valor de A: ");
    int a = leitor.nextInt();

    System.out.println("Insira o valor de B: ");
    int b = leitor.nextInt();

    System.out.println("Insira o valor de C: ");
    int c = leitor.nextInt();

    menorMaior(a, b, c);

    leitor.close();
  }
}
