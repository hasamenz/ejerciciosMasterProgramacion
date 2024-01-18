package ejercicio12;

public class NumeroDecreciente {
    public static void main(String[] args) {
        serieNumeros(100);
    }

    public static void serieNumeros( int numero){
        System.out.println("Del " + numero + " al " +0);
        for (int i = numero; i >= 0; i-=8){
            System.out.println(" n° " +i);
        }
    }
}
