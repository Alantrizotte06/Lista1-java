import java.util.Scanner;

public class Exercicio19 {
  public static void volume(double raio, double altura) {
    double formula = 3.14 * raio * raio * altura;

    System.out.println("Volume: " + formula);
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira o raio: ");
    double raio = leitor.nextDouble();

    System.out.println("Insira a altura: ");
    double altura = leitor.nextDouble();

    volume(raio, altura);

    leitor.close();
  }
}
