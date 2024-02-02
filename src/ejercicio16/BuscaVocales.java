package ejercicio16;

public class BuscaVocales {
    public static void main(String[] args) {
        bucasvocales("holacomoestas");
    }

    public static void bucasvocales(String frase){
        String letras[] = frase.split("");
        int contadorVocales = 0;
        for (int i = 0; i < frase.length(); i++){
            if (letras[i].equals("a") || letras[i].equals("e") || letras[i].equals("i") || letras[i].equals("o") || letras[i].equals("u")){
                contadorVocales++;
            }
        }
        System.out.println("El total de vocales en la frase es " +contadorVocales);
    }
}
