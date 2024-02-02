package ejercicio14;

public class RepiteNumero {
    public static void main(String[] args) {
        repetir("Hugo",4);
    }
    public static void repetir(String valor, int numeroveces){

        for (int i = 0; i <= numeroveces; i++){
            System.out.println(valor);
        }
    }
}
