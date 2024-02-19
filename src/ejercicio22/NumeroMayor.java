package ejercicio22;

public class NumeroMayor {
    public static void main(String[] args) {
        calcularNumero(312,57);
    }

    public static void calcularNumero(int numero1, int numero2){

        if (numero1 > numero2){
            System.out.println("El numero mayor es : "+numero1);
            System.out.println("El numero menor es : "+numero2);
        }else {
            System.out.println("El numero mayor es : "+numero2);
            System.out.println("El numero menor es : "+numero1);
        }
    }
}
