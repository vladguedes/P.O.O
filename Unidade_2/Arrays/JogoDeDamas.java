package Unidade_2.Arrays;

public class JogoDeDamas {
    char[][] tabuleiro;

    JogoDeDamas() {
        this.tabuleiro = new char[8][8]; 
        for (int l = 0; l < tabuleiro.length; l++) {
            for (int c = 0; c < tabuleiro[l].length; c++) {
                tabuleiro[l][c] = '.';
            }
        }
        //Time preto
        for (int l = 0; l <= 2; l++) {
            for (int c = 1 - l%2; c < tabuleiro[l].length; c+=2) {
                tabuleiro[l][c] = 'o';
            }
        }

        //Time branco
        for (int l = 5; l <= 7; l++) {
            for (int c = 1 - l%2; c < tabuleiro[l].length; c+=2) {
                tabuleiro[l][c] = 'x';
            }
        }
    }

    public String toString() {
        String res = "";

        for (int l = 0; l < tabuleiro.length; l++) {
            for (int c = 0; c < tabuleiro[l].length; c++) {
                res += tabuleiro[l][c];
                res += "  ";
            }
            res += "\n";
        }
        
        return (res);
    }
}
