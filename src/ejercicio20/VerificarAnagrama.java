package ejercicio20;

public class VerificarAnagrama {
    public static void main(String[] args) {
        textoAnagrama("amor","poma");
    }

    public static String[] ordenarCadenas(String[] cadena){
        for (int i = 0; i < cadena.length; i++){
            for (int j = 0; j < cadena.length;j++){
               if (cadena[i].compareTo(cadena[j]) < 0){
                   String aux = cadena[i];
                   cadena[i] = cadena[j];
                   cadena[j] = aux;
               }
            }
        }
        return cadena;
    }

    public static void textoAnagrama(String texto1, String texto2){
        String[] cadena1 = ordenarCadenas(texto1.split(""));
        String[] cadena2 = ordenarCadenas(texto2.split(""));
        boolean valida = true;
        for (int i = 0; i < cadena1.length; i++){
            valida = cadena1[i].equals(cadena2[i]);
        }
        if (valida){
            System.out.println("Son anagramas");
        }else {
            System.out.println("No son anagramas");
        }

    }
}
