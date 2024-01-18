package ejercicio10;

public class DibujaEscalera {
    public static void main(String[] args) {
        escaleras(6);
    }

    public static void escaleras(int escalones){
        String escalon = "[-]";
        for (int i = 0; i < escalones; i++){
            cantidadEscalones(escalon,i);
            System.out.println();
        }
    }
    public static void cantidadEscalones(String escalon, int veces){
        for (int i = 0; i <= veces; i++){
            System.out.print(escalon);
        }
    }

}
