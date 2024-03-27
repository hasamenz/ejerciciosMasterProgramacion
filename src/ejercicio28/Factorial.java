package ejercicio28;

public class Factorial {
    public static void main(String[] args) {
        calculateFactoria(5);


    }

    public static void calculateFactoria(int numero){
        int count = 1;
        for (int i = 1; i <= numero; i++){
            System.out.print(i + "X ");
            count = count * i;
        }
        System.out.println();
        System.out.println("El valor del factorial de : " +numero + " = " +count);
    }
}
