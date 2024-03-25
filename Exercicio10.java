import java.util.Scanner;

public class Exercicio10 {
  public static void numExt(int a) {
    switch (a) {
      case 1:
        System.out.println("Um.");
        break;
      case 2:
        System.out.println("Dois.");
        break;
      case 3:
        System.out.println("Três.");
        break;
      case 4:
        System.out.println("Quatro.");
        break;
      case 5:
        System.out.println("Cinco.");
        break;
      default:
        System.out.println("O valor inserido é invalido, valores válidos de 1 a 5.");
        break;
    }
  }

  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Insira um número de 1 a 5 para escrever por extenso: ");
    int a = leitor.nextInt();

    numExt(a);

    leitor.close();
  }
}
