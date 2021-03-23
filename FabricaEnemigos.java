public class FabricaEnemigos {
    
    public static Enemigo construir(String tipo) {
        switch (tipo) {
            case "Ogro":
                return new Ogro();
            case "Dragon":
                return new Dragon();
            default:
                System.out.println("No se reconoce el tipo");
                return null;
        }
            
    }

}
