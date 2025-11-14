import java.util.Scanner;

public class paraules {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digues qualsevol paraula: ");
    String start = sc.nextLine();
    String fin = "stop";
    while(true){
        System.out.println(start.length());
        if (start.equals(fin)){
        continue;

        }
        sc.close();
    }
    
    }
}
