import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do jogador: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade de gols: ");
        String golsInput = scanner.nextLine();

        int gols;

        try {
            gols = Integer.parseInt(golsInput);
        } catch (NumberFormatException e) {
            gols = 0;
        }

        if (nome.trim().isEmpty()) {
            Jogador.fichaJogador(gols);
        } else {
            Jogador.fichaJogador(nome, gols);
        }

        scanner.close();
    }
}