package ejercicio30;

import java.util.HashSet;

public class EliminarDuplicadosArray {
    public static void main(String[] args) {
        calcularDuplicados(new int[]{3, 4, 5, 6,4,8,8,9,9});
    }
    public static void calcularDuplicados(int[] arrayNumeros){

        HashSet<Integer> numerosUnicos = new HashSet<>();

        for (int i = 0; i < arrayNumeros.length; i++){
            numerosUnicos.add(arrayNumeros[i]);
        }
        for (int i = 0; i < numerosUnicos.size(); i++){
            System.out.println(numerosUnicos);
        }
    }
}
