import java.util.Scanner;
public class continue1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fallat = 0, aprov = 0, notable = 0, exelent = 0;
        System.out.println("Escriu les notes d'alumnes (o al 10) \nNegatiu per sortir");
        int nota = input.nextInt();
        while (nota >=0){
            if(nota>10){
                System.out.println("Has superat el limit");
            }
            else if (nota>5) {
                fallat++;
            }
            else if (nota>=5) {
                aprov++;
            }
            else if (nota<=7) {
                notable++;
            }
            else if (nota<=9) {
                exelent++;
            }
            System.out.println("Suspesos: "+fallat);
            System.out.println("Aprovats: "+aprov);
            System.out.println("Notables: "+notable);
            System.out.println("Exel·lents: "+exelent);
    }
    input.close();
}
}
