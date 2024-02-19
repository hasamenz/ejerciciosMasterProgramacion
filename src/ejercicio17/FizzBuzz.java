package ejercicio17;

public class FizzBuzz {
    public static void main(String[] args) {
        numero(30);
    }

    public static void numero(int numero){
        for (int i = 1; i <= numero; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("buzzlightyear");
            }else if (i % 3 == 0){
                System.out.println("buzz");
            } else if (i % 5 == 0) {
                System.out.println("lightyear");
            } else {
                System.out.println(i);
            }
        }
    }
}

