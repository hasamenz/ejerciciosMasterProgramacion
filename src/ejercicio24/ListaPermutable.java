package ejercicio24;

public class ListaPermutable {
    public static void main(String[] args) {
        calcularLista(new int[]{1, 2, 3, 4, 5},5);
    }

    public static void calcularLista(int[]listaNumeros, int numeroFinal){
        int contador = listaNumeros[0];
        for (int i = 0; i < listaNumeros.length; i++){

            if (listaNumeros[i] == contador && listaNumeros[0] == 1 && listaNumeros[listaNumeros.length -1] == numeroFinal){
                System.out.println(listaNumeros[i] + " Si es correlativo");
                contador++;

            }else {
                System.out.println("No es correlativo");
                break;
            }

        }
    }

    public static void numeroMaximoArreglo(int[] listaNumeros){


    }

}
