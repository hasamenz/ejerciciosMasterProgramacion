package ejercicio24;

public class ListaPermutable {
    public static void main(String[] args) {
        calcularLista(new int[]{4, 5, 8, 7},7);
    }

    public static void calcularLista(int[]listaNumeros, int numeroFinal){
        int contador = 0;
        for (int i = 0; i < listaNumeros.length; i++){

            if (listaNumeros[i] == contador){
                System.out.println(listaNumeros[i] + "Si es correlativo");
                contador++;
            }

        }
    }

}
