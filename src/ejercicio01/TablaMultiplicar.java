package ejercicio01;
import java.util.Scanner;
public class TablaMultiplicar {
    public static void main(String[] args) {
        /*
        * Dado un numero, devolver su tabla de multiplicar completa.
        *
        * */
        int numero;
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el numero de la trabla de multiplicar : ");
        numero = input.nextInt();

        for (int i = 0; i <= 12; i ++){
            System.out.println(numero +" X " + i + " = " +(numero * i));
        }
    }
}
