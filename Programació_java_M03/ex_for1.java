import java.util.Scanner;
public class ex_for1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        for(i = 0; i<20; i = i + 2){
            System.out.println(i);
        }
        input.close();
    }
}
