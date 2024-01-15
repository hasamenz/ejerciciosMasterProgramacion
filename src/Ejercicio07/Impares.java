package Ejercicio07;

public class Impares {
    public static void main(String[] args) {

        numeroImparesEntre(100,171);
    }
    public static void numeroImparesEntre(int num1,int num2){
        if (num1 > num2){
            System.out.println("El primer numero debe ser mayor que el segundo numero, digite nuevamente.");
        }else {
            for (int i = num1; i <= num2; i++) {
                if (!(i % 2 == 0)) {
                    System.out.println(i);
                }
            }
        }
    }

}
