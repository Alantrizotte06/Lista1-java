import java.util.Scanner;

public class Exercicio20 {
  public static void executar() {
    Scanner leitor = new Scanner(System.in);

    System.out.println("Informe o tempo da viagem em horas:");
    double tempoViagem = leitor.nextDouble();

    System.out.println("Informe a velocidade média da viagem em km/h:");
    double velocidadeMedia = leitor.nextDouble();

    double distancia = tempoViagem * velocidadeMedia;
    double consumoCombustivel = distancia / 12.0;

    System.out.printf("A quantidade de litros de combustível gasta na viagem é: litros\n", +consumoCombustivel);

    leitor.close();
  }
}
