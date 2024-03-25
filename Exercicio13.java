import java.util.Scanner;

public class Exercicio13 {
  public static void operadores(String a, double b, double c) {
    switch (a) {
      case "+":
        System.out.println("" + (b + c));
        break;
      case "-":
        System.out.println("" + (b - c));
        break;
      case "/":
        System.out.println("" + (b / c));
        break;
      case "*":
        System.out.println("" + (b * c));
        break;
      default:
        System.out.println("Operador invalido.");
        break;
    }
    if (b == 0 || c == 0) {
      System.out.println("O valor de A ou B não pode ser zero.");
    }
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira o operador: ");
    String a = leitor.nextLine();

    System.out.println("Insira o valor de A: ");
    double b = leitor.nextInt();

    System.out.println("Insira o valor de B: \n");
    double c = leitor.nextInt();

    System.out.println("O valor da operação eh:");
    operadores(a, b, c);

    leitor.close();
  }
}