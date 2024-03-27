package ejercicio26;

import java.util.ArrayList;
import java.util.Arrays;

public class SerieFibonacci {
    public static void main(String[] args) {
        fibonacci(19);
    }

    public static void fibonacci(int numero){
        int count = 0;
        ArrayList<Integer> listFibonacci = new ArrayList<>();
        listFibonacci.add(0);
        listFibonacci.add(1);

        for (int i = 2; i < numero; i++){
            listFibonacci.add(listFibonacci.get(i - 1) + listFibonacci.get(i - 2));

        }
        System.out.println("Lista fibonacci = " + listFibonacci);
        System.out.println("Ultimo elemento de la lista :" + listFibonacci.get(numero - 1));
    }

}
