import java.util.Scanner;

public class Exercicio06 {
  public static double formula(double c) {
    c = (9 * c + 160) / 5;

    return c;
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira a temperatura em graus Celsius:");
    double c = leitor.nextDouble();

    System.out.println("A conversão em graus Fahrenheit é: " + formula(c) + "°C");

    leitor.close();
  }
}
