package ejercicio32;
/**
 * Dado un array de numeros, devolver el array con sus numeros elevados al cuadrado
 *
 * */
public class Alcuadrado {
    public static void main(String[] args) {
        devolverAlCuadrado(new int[]{2,5,7});
    }

    public static void devolverAlCuadrado(int[]numeros){
        for (int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i]*numeros[i]);
        }
    }


}
