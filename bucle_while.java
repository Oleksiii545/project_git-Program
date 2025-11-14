import java.util.Scanner;
public class bucle_while {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdueix el numero enter desde l'1 fins a N: ");
        int num = input.nextInt();
        int i = 0;
        while (i <=num){
            System.out.println("Numero és: "+i++);
        }
        input.close();
    }
}
