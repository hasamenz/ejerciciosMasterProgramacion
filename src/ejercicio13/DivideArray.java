package ejercicio13;

public class DivideArray {
    public static void main(String[] args) {
        divideArray(new int[]{4,5, 6, 1,20,14,7},2);
    }

    public static void divideArray(int[] arrayPrincipal, int numero){
        int[] array1 = new int[numero];
        int cantidad = 0;

        for (int i = 0; i < arrayPrincipal.length; i++){
            array1[cantidad] = arrayPrincipal[i];
            cantidad++;

            if (cantidad == numero || i == arrayPrincipal.length - 1){
                System.out.println("Parte dividida : ");
                for (int elemento : array1){
                    System.out.print(elemento + " ");
                }
                System.out.println();
                cantidad = 0;
            }
        }
    }
}
