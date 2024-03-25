import java.util.Scanner;

public class Exercicio07 {
  public static void comparar(int a) {
    if (a > 200) {
      System.out.println("O numero está no intervalo de 100 a 200.");
    } else if (a >= 100) {
      System.out.println("O número está no intervalo de 100 a 200.");
    } else {
      System.out.println("O número está fora do intervalo de 100 a 200.");
    }
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira o valor: ");
    int a = leitor.nextInt();

    comparar(a);

    leitor.close();
  }
}
