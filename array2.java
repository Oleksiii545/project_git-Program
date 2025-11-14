public class array2 {
    public static void main(String[] args) {
        int[] edats ={24,53,23,43,31};
        int minim = edats[0], maxim = edats[0];
        int suma = 0;
        for (int edat : edats){
            suma += edat;
            if (edat < minim) {
                minim = edat;
            }
            if (edat > maxim) {
                maxim = edat;
            }
            int mitja = suma/5;
            System.out.println("Resultat de mitjana: "+mitja+" \nMaxima edat"+maxim+" \nMinima edat"+minim);
        }
    }
}
