package ejercicio03;

import java.util.Scanner;

public class EncuentraPalabra {
    //Dada una palabra, buscarla en una frase y devolver cuantas vees aparece esa palabra en la frase escrita.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la frase : ");

        System.out.println(Encuentrafrase("caballero de fina estampa mucho bello caballero en el rancho caballero caballeros","caballero"));

    }
    public static int Encuentrafrase(String frase, String palabra){
        String[] arrayFrase = frase.split(" ");
        int contador = 0;
        for (int i = 0; i < arrayFrase.length; i++){
            if (arrayFrase[i].equals(palabra)){
                contador++;
            }
        }
        return contador;
    }

}
