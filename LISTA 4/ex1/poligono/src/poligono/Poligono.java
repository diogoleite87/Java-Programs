package poligono;
import java.util.ArrayList;
import java.util.Objects;


public class Poligono {

    private Ponto ponto;


    public Poligono (){

    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "ponto= x:" + getPonto().getX() + " y:" + getPonto().getY() +
                '}';
    }
}
