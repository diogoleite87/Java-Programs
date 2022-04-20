package jogo;

public enum StatusPlace {
    EMPTY(0), PLAYER_ONE(1) , PLAYER_TWO(2);

    public int valorCampo;
    StatusPlace(int valor) {
        valorCampo = valor;
    }

    public int getValor(){
        return valorCampo;
    }
}
