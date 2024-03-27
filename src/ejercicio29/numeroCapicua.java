package ejercicio29;

public class numeroCapicua {
    public static void main(String[] args) {
        calcularteNumberCapicua(5225);
    }

    public  static void calcularteNumberCapicua(int number){
        String numeroletras =  Integer.toString(number);
        String[] numeroSeparado = numeroletras.split("");
        boolean validate = true;
        for (int i = 0; i < numeroSeparado.length; i++){
            if (!(numeroSeparado[i].equals(numeroSeparado[numeroSeparado.length -i -1]))){
                validate = false;
                break;
            }
        }
        if (validate){
            System.out.println("El numero es capicua");
        }else {
            System.out.println("El numero no es capicua");

        }
    }
}
