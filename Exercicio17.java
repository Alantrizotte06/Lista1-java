import java.util.Scanner;

public class Exercicio17 {
  public static void mediaPonderada(double nota1, double peso1, double nota2, double peso2, double nota3,
      double peso3) {

    double media = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) / (peso1 + peso2 + peso3);

    System.out.println("A média ponderada é: " + media);
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    double[] nota = new double[3];

    for (int cont = 0; cont < 3; cont++) {
      System.out.println("Insira o valor da nota " + (cont + 1) + ": ");
      nota[cont] = leitor.nextDouble();
    }

    mediaPonderada(nota[0], 0.3, nota[1], 0.4, nota[2], 0.3);

    leitor.close();
  }
}
