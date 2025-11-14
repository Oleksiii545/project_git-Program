public class array3 {
    public static void main(String[] args) {
        int[] numeros = {975961,215728,331,6948,-14,6495,6737,871,66838,83,486,-23,0,};
        for(int element : numeros){
            if(element > 0){
                System.out.println("Resultat: "+element);
            }
            else if (element == 0) {
                break;
            }
        }
    }
}
