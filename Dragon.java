import java.util.ArrayList;

public class Dragon<E> implements Enemigo<E> {

    private ArrayList<E> danio_recibido;

    public Dragon() {
        this.danio_recibido = new ArrayList<E>();
    }

    @Override
    public void disparar() {
        System.out.println("Dragon disparando");
    }

    @Override
    public String morder() {
        return "Dragon mordiendo";
    }

    @Override
    public void danio(E valor) {
        this.danio_recibido.add(valor);
    }
}
