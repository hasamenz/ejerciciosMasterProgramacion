package ejercicio25;

public class DemayuToMinus {
    public static void main(String[] args) {
        mayusMinus("Lion Bikers");
    }

    public static void mayusMinus(String palara){

        String[] letterSeparate = palara.replace(" ","").split("");
        int countMayus = 0;
        int countMinus = 0;

        for (int i = 0; i < letterSeparate.length; i++){
            if(letterSeparate[i].equals(letterSeparate[i].toUpperCase())){
                countMayus++;
            }else {
                countMinus++;
            }
        }
        System.out.println("La cantidad de mayusculas : " +countMayus + "\nLa cantidad de minusculas : "+countMinus);

        if (countMayus > countMinus){
            System.out.println("La frase es : " + palara.toUpperCase());
        }else {
            System.out.println("La frase es : " +palara.toLowerCase());
        }
    }


}
