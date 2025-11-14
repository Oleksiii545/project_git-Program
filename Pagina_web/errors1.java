import java.util.Scanner;
public class errors1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            try{
                System.out.println("Introdueix els dos numeros");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                int res = num1 / num2;
                System.out.println(res);
            }
            catch(ArithmeticException e){
                System.out.println("No és pot divir en 0");
                continue;
            }
            break;
        }
        input.close();
    }
}
