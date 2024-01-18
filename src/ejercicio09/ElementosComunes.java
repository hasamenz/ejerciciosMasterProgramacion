package ejercicio09;

import java.util.ArrayList;

public class ElementosComunes {
    public static void main(String[] args) {
        elementos(new int[]{7,8,4,6,3,12,2}, new int[]{3,8,7,9,5,2,18});


    }
    public static void elementos(int[] array1, int[] array2){
        ArrayList lista3 = new ArrayList();
        for (int i = 0; i < array1.length; i++){
            for (int j = 0; j < array2.length; j++){
                if (array1[i] == array2[j]){
                    lista3.add(array2[j]);
                }

            }
        }
        for (Object element : lista3)
            System.out.print(element + "-");
        System.out.println();

    }
}
