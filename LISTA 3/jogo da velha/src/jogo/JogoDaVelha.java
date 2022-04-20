package jogo;

public class JogoDaVelha {

    private boolean fimDoJogo = false;
    private boolean campoValido = true;
    private int contador = 0;
    private int tabuleiro[][] = new int[3][3];

    public boolean getCampoValido() {
        return campoValido;
    }

    public void setContador(int contador) {
        this.contador += contador;
    }

    public boolean getFimDoJogo() {
        return fimDoJogo;
    }

    public JogoDaVelha() {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = StatusPlace.EMPTY.valorCampo;
            }
        }
    }

    public void Jogador1(int x, int y) {
        if (this.tabuleiro[x][y] == StatusPlace.EMPTY.valorCampo) {
            this.tabuleiro[x][y] = StatusPlace.PLAYER_ONE.valorCampo;
            campoValido = true;
        } else {
            System.out.println("Essa posição ja foi escolhida, tente novamente!");
            campoValido = false;
        }
    }

    public void Jogador2(int x, int y) {
        if (this.tabuleiro[x][y] == StatusPlace.EMPTY.valorCampo) {
            this.tabuleiro[x][y] = StatusPlace.PLAYER_TWO.valorCampo;
            campoValido = true;
        } else {
            System.out.println("Essa posição ja foi escolhida, tente novamente!");
            campoValido = false;
        }
    }


    public String toString() {
        String resposta = "";

        resposta += "   0  1  2  y";
        resposta += "\n";
        resposta += "0  " + tabuleiro[0][0] + "  " + tabuleiro[0][1] + "  " + tabuleiro[0][2];
        resposta += "\n";
        resposta += "1  " + tabuleiro[1][0] + "  " + tabuleiro[1][1] + "  " + tabuleiro[1][2];
        resposta += "\n";
        resposta += "2  " + tabuleiro[2][0] + "  " + tabuleiro[2][1] + "  " + tabuleiro[2][2];
        resposta += "\n";
        resposta += "x \n\n";

        return resposta;
    }

    public void verificaVitoria() {
        if (
                           tabuleiro[0][0] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[0][1] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[0][2] == StatusPlace.PLAYER_ONE.valorCampo
                        || tabuleiro[1][0] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[1][1] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[1][2] == StatusPlace.PLAYER_ONE.valorCampo
                        || tabuleiro[2][0] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[2][1] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[2][2] == StatusPlace.PLAYER_ONE.valorCampo
                        || tabuleiro[0][0] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[1][1] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[2][2] == StatusPlace.PLAYER_ONE.valorCampo
                                   || tabuleiro[0][2] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[1][1] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[2][0] == StatusPlace.PLAYER_ONE.valorCampo

                        || tabuleiro[0][0] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[1][0] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[2][0] == StatusPlace.PLAYER_ONE.valorCampo
                        || tabuleiro[0][1] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[1][1] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[2][1] == StatusPlace.PLAYER_ONE.valorCampo
                        || tabuleiro[0][2] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[1][2] == StatusPlace.PLAYER_ONE.valorCampo
                                   && tabuleiro[2][2] == StatusPlace.PLAYER_ONE.valorCampo

        ) {
            fimDoJogo = true;
            System.out.println("\n\nParabens Jogador 1, voce venceu!! ");
        } else if (
                           tabuleiro[0][0] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[0][1] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[0][2] == StatusPlace.PLAYER_TWO.valorCampo
                        || tabuleiro[1][0] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[1][1] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[1][2] == StatusPlace.PLAYER_TWO.valorCampo
                        || tabuleiro[2][0] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[2][1] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[2][2] == StatusPlace.PLAYER_TWO.valorCampo
                        || tabuleiro[0][0] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[1][1] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[2][2] == StatusPlace.PLAYER_TWO.valorCampo
                                   || tabuleiro[0][2] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[1][1] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[2][0] == StatusPlace.PLAYER_TWO.valorCampo
                        || tabuleiro[0][0] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[1][0] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[2][0] == StatusPlace.PLAYER_TWO.valorCampo
                        || tabuleiro[0][1] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[1][1] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[2][1] == StatusPlace.PLAYER_TWO.valorCampo
                        || tabuleiro[0][2] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[1][2] == StatusPlace.PLAYER_TWO.valorCampo
                                   && tabuleiro[2][2] == StatusPlace.PLAYER_TWO.valorCampo
        ) {
            fimDoJogo = true;
            System.out.println("\n\nParabens Jogador 2, voce venceu!! ");
        } else if (contador == 9){
            fimDoJogo = true;
            System.out.println("\n\nOcorreu um empate!! ");

        }
    }


}
