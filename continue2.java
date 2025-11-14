import java.util.Scanner;
public class continue2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digues un numero");
        int n = input.nextInt();
        boolean first = true;
        int i;
        if (n !=1) {
            for(i=2;i<n;i++){
                if (n%i==0) {
                    first = false;
                    continue;
                }
            }
            String res = (first)? ("El numero "+n+" és primer"):("el numero "+n+" no és primer");
            System.out.println(res);
        }
        input.close();
    }

}
