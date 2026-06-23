public class Jogador {

    // Método principal (com nome e gols)
    public static void fichaJogador(String nome, int gols) {
        System.out.println("O jogador " + nome + " marcou " + gols + " gol(s)");
    }

    // Sobrecarga: quando não informamos o nome
    public static void fichaJogador(int gols) {
        fichaJogador("<desconhecido>", gols);
    }
}
