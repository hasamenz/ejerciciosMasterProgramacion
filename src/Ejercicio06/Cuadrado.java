package Ejercicio06;
/**
 * Esta clase es para calcular el area de un cuadrado
 * Esta clase acepta un parametro que es el lado de la figura, con ello
 * el resultado es el area en metros cuadrados.
 * */
public class Cuadrado {
    public static void main(String[] args) {
        dibujaCuadrado(8);
    }
    public static void dibujaCuadrado(int cantidadAsteriscos){
        for (int i = 0; i < cantidadAsteriscos; i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < cantidadAsteriscos - 2; i++){
            System.out.print("*");
            for (int l = 0; l < cantidadAsteriscos - 2; l++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 0; i < cantidadAsteriscos; i++){
            System.out.print("*");
        }
    }
}
