package ejercicio08;

public class InvertirNumero {
    public static void main(String[] args) {
        invertir(7845);
    }
    public static void invertir(int numero){
        String numeroTexto = String.valueOf(numero);
        String cadenaValores[] = numeroTexto.split("");
        for (int i = 0; i < cadenaValores.length; i++){
            System.out.print(cadenaValores[cadenaValores.length - i - 1]);
        }
    }
}
