package Lista_1.CriacaoDeClasses;

public class Time {
    String nomeDoTime;
    String treinador;
    String adversario;
    String campeonato;
    int pontos;
    int pontosAdversario;
    int classificacao;
    int classificacaoAdversario;
    int gols;
    int golsAdversario;

    Time(String nomeDoTime, String treinador, String adversario, String campeonato, int pontos, int pontosAdversario, int classificacao,int classificacaoAdversario, int gols, int golsAdversario) {
        this.nomeDoTime = nomeDoTime;
        this.treinador = treinador;
        this.adversario = adversario;
        this.campeonato = campeonato;
        this.pontos = pontos;
        this.pontosAdversario = pontosAdversario;
        this.classificacao = classificacao;
        this.classificacaoAdversario = classificacaoAdversario;
        this.gols = gols;
        this.golsAdversario = golsAdversario;
    }

    void mostraTime() {
        System.out.println("Nome do time: " + nomeDoTime);
        System.out.println("Treinador: " + treinador);
        System.out.println("Campeonato: " + campeonato);
        System.out.println("Classificação: " + classificacao);
        System.out.println("Pontuação: " + pontos);
        System.out.println("Gols: " + gols);
    }

    void mostraTimeAdversario() {
        System.out.println("Nome do time adversário: " + adversario);
        System.out.println("Campeonato: " + campeonato);
        System.out.println("Classificação: " + classificacaoAdversario);
        System.out.println("Pontuação do adversário: " + pontosAdversario);
        System.out.println("Gols do Adversário: " + golsAdversario);
    }

    void mostraResultado() {
        if (gols > golsAdversario) {
            System.out.printf("%s|%d| X %s|%d|", nomeDoTime, gols, adversario, golsAdversario);
            System.out.printf("\n%s Venceu com %d Pontos!", nomeDoTime, pontos);
        } else {
            System.out.printf("%s|%d| X %s|%d|", adversario, golsAdversario, nomeDoTime, gols);
            System.out.printf("\n%s Venceu com %d Pontos!", adversario, pontosAdversario);
        }
    }

}
