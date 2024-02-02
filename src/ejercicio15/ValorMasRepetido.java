package ejercicio15;

import java.util.Objects;

public class ValorMasRepetido {
    public static void main(String[] args) {
        letraMasUsada("Hoolaassss");
    }
    public static void letraMasUsada(String frase){
        String[]fraseSeparada = frase.split("");
        int contar = 0;
        String variable = "";

        for (int i = 0; i < fraseSeparada.length; i++){
            variable = fraseSeparada[i];
            for (int j = 0; j < fraseSeparada.length;j++){
                if (variable.equals(fraseSeparada[j])){
                    contar++;
                }
            }
            System.out.println(variable +contar);
            contar = 0;
        }
    }
}
