import java.util.Scanner;

public class Exercicio18 {
  public static void mediaHarmonica(double nota1, double nota2, double nota3) {
    double formula = ((nota1 / 1) + (nota2 / 1) + (nota3 / 1)) / 3;

    System.out.println("Média: " + formula);
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    double[] nota = new double[3];

    for (int a = 0; a < 3; a++) {
      System.out.println("Insira a nota " + (a + 1) + ": ");
      nota[a] = leitor.nextDouble();
    }

    mediaHarmonica(nota[0], nota[1], nota[2]);

    leitor.close();
  }
}