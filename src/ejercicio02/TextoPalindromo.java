package ejercicio02;

import java.util.Scanner;

public class TextoPalindromo {
    public static void main(String[] args) {

        String cadenatexto;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la cadena de texto : ");
        cadenatexto = input.nextLine();

        String[] revez = new String[cadenatexto.length()];
        String[] separado = cadenatexto.split("");

        for (int i = 0; i < separado.length; i++){
            revez[i] = separado[separado.length - i - 1];
        }

        String textoRevez = String.join("",revez);

        if (cadenatexto.equals(textoRevez.toString())){
            System.out.println("Son Palindromos " +textoRevez);
        }else {
            System.out.println("No son Palindromos " +textoRevez);
        }
    }
}
