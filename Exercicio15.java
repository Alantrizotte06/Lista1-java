import java.util.Scanner;

public class Exercicio15 {
  public static void formDistancia(int px1, int px2, int py1, int py2) {
    double formula = Math.sqrt(Math.pow((px2 - px1), 2) + Math.pow((py2 - py1), 2));

    System.out.println("Distância: " + formula);
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira o valor de x1: ");
    int px1 = leitor.nextInt();

    System.out.println("Insira o valor de y1: ");
    int py1 = leitor.nextInt();

    System.out.println("Insira o valor de x2: ");
    int px2 = leitor.nextInt();

    System.out.println("Insira o valor de y2: ");
    int py2 = leitor.nextInt();

    formDistancia(px2, px1, py2, py1);

    leitor.close();
  }
}
