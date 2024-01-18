package ejercicio11;

public class TextoReemplazo {
    public static void main(String[] args) {
        buscaTexto("hola como estas como ha estado tu dia","dia");
    }


    public static void buscaTexto(String texto, String palabra){

        String[] textoSeparado = texto.split(" ");
        for (int i = 0; i < textoSeparado.length; i++){
            if (textoSeparado[i].equals(palabra)){
                textoSeparado[i] = "[-CENSURADO-]";
            }
        }
        for (String palabraFinal : textoSeparado){
            System.out.print(palabraFinal+" ");
        }
    }
}
