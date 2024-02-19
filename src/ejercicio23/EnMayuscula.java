package ejercicio23;

public class EnMayuscula {
    public static void main(String[] args) {
        CambiarMayuscula("este es un mensaje de prueba no lo repliques");
    }

    public static void CambiarMayuscula(String texto){
        String[] cadenaArray = texto.split(" ");
        for (String s : cadenaArray) {
            System.out.print(s.toUpperCase().charAt(0) + s.substring(1).toLowerCase() + " ");
        }
    }
}
