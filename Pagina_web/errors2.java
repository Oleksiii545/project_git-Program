
import java.util.InputMismatchException;
import java.util.Scanner;
public class errors2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fica el numero");
        //int num = sc.nextInt();
        while (true) {
            
        int num =0;
        try {
            num = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("El format incorrecte s'ha de ser numeros");
            sc.nextLine();
            continue;
        } 
        System.out.println(num);
        sc.close();
    }
    }
}
