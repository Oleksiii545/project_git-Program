import java.util.Scanner;
public class index3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("introdueix els dos numeros ");
        int fil = input.nextInt();
        int amp = input.nextInt();
        int i, j;
        for (j=1;j<=amp;j++){
            
            for (i=1;i<=fil;i++){
            System.out.print(" * ");
          }
          System.out.println();
        }
            System.out.println();
        
        input.close();
    }   
}
