package ejercicio21;
import java.util.Arrays;

public class RecortarString {
    public static void main(String[] args) {
        recorte("holaComoEstas",5);
    }

    public static void recorte(String cadenaTexto, int cantidadRecortar){
        String[] cadena = cadenaTexto.split("");

        for (int i = 0; i < cantidadRecortar; i++){
            System.out.print(cadena[i]);
        }



    }
}
