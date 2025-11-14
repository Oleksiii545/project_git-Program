import java.util.Scanner;
public class for_break1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Introdueix un numero");
        int num = input.nextInt();
        int i;
        for(i = 0;i<=num;i++){
            if (i % 2 == 0){
                System.out.println(i);
                continue;
            }
        }
        System.out.println(i);
        input.close();   
    }
}
