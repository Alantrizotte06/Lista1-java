import java.util.Scanner;

public class Exercicio16 {
  public static void mediaNota(double nota1, double nota2, double nota3) {
    double resFinal = (nota1 + nota2 + nota3) / 3;

    System.out.println(
        "Nota1: " + nota1 + "\nNota2: " + nota2 + "\nNota3: " + nota3 + "\nMédia: " + resFinal);
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    double[] nota = new double[3];

    for (int a = 0; a < 3; a++) {
      System.out.println("Insira a nota " + (a + 1) + ": ");
      nota[a] = leitor.nextDouble();
    }

    mediaNota(nota[0], nota[1], nota[2]);

    leitor.close();
  }
}
