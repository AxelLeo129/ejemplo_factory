public class Main {

    public static void main(String[] args){
        Enemigo <Double> enemigo = FabricaEnemigos.construir("Dragon");
        enemigo.disparar();
    }
    
}
