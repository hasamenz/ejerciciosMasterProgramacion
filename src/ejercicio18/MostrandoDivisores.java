package ejercicio18;

public class MostrandoDivisores {
    public static void main(String[] args) {
        CalculoDivisores(20);
    }
    public static void CalculoDivisores(int numero){
        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                System.out.println(i);
            }
        }

    }
}
