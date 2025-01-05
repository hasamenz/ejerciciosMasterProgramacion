package ejercicio31;
/*
* Dado un numero indica ruqe tipo de angulo es
*
* */

import java.util.Scanner;

public class MedidaAngulos {
    public static void main(String[] args) {
        int medidaAngulo;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el la medida del angulo : ");
        medidaAngulo = input.nextInt();
        calculaAngle(medidaAngulo);

    }
    public static void calculaAngle(int numberangle){
       if (numberangle < 0 ){
           System.out.println("El angulo no puede ser negativo, digite un angulo positivo");
       }else if (numberangle < 90){
           System.out.println("El tipo de angulo es : AGUDO");
       } else if (numberangle == 90) {
           System.out.println("El tipo de angulo es : RECTO");
       } else if (numberangle < 180) {
           System.out.println("El tipo de angulo es : OBTUSO");
       } else if (numberangle == 180) {
           System.out.println("El tipo de angulo es : LLANO");
       } else if (numberangle < 360) {
           System.out.println("El tipo de angulo es : CONCAVO");
       }
    }
}
