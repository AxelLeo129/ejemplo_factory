import java.util.ArrayList;

public class Ogro<E> implements Enemigo<E> {

    private ArrayList<E> danio_recibido;

    public Ogro() {
        this.danio_recibido = new ArrayList<E>();
    }

    @Override
    public void disparar() {
        System.out.println("Ogro disparando");
    }

    @Override
    public String morder() {
        return "Ogro mordiendo";
    }

    @Override
    public void danio(E valor) {
        this.danio_recibido.add(valor);
    }
    
}
