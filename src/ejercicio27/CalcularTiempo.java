package ejercicio27;

public class CalcularTiempo {
    public static void main(String[] args) {
        CalculateTime(2263);

    }

    public static void CalculateTime(int numero){
        int countAnios = 0;
        int countMes = 0;
        int countDias = 0;
        int restvalue = 0;

        System.out.println("La cantidad " +numero +" son :" );
        while (numero >= 365){
            restvalue = numero - 365;
            countAnios++;
            numero = restvalue;
        }

        while (numero >= 12){
            restvalue = numero - 12;
            countMes++;
            numero = restvalue;
        }



        System.out.println("Conteo de años  = " + countAnios + " años.");
        System.out.println("Conteo de meses = " + countMes + " meses.");
        System.out.println("Conteo de dias  = " + restvalue + " dias");


    }
}
