import java.util.Scanner;
public class index2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("introdueix els dos numeros ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        for (num1=1;num1<10;num1++){
            System.out.print("*");
            for (num2=1;num2<10;num2++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }   
}
