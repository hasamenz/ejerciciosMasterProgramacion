package ejercicio19;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MostrarPeliculas {
    public static void main(String[] args) {
        Peliculas[] peliculas = new Peliculas[4];
        peliculas[0] = new Peliculas("El señor de los anillos","PeterJacson",true);
        peliculas[1] = new Peliculas("Batman vs Superman","Snyder",false);
        peliculas[2] = new Peliculas("Rapidos y furiosos","Karls Turbon",true);
        peliculas[3] = new Peliculas("Interestellar","Christopher Nolan",false);

        for (int i = 0; i < peliculas.length; i++){
            if (!(peliculas[i].vista)){
                //System.out.println(peliculas[i].autor);
                System.out.println("Te falta ver : " + peliculas[i].nombre);
            }
        }

    }
    
    public static class Peliculas{
        String nombre;
        String autor;
        boolean vista;

        public Peliculas() {
        }

        public Peliculas(String nombre, String autor, boolean vista) {
            this.nombre = nombre;
            this.autor = autor;
            this.vista = vista;
        }

    }
}

