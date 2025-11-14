import java.util.Scanner;
public class continue3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int neg=0,pos=0,sumpos=0,sumneg=0,num;
        do{
            System.out.println("Fica el numero");
            num = input.nextInt();
            if(num>0){
                sumpos = sumpos + num;
                pos = pos +1;
            }
            else if (num <0) {
                sumneg = sumneg+num;
                neg = neg +1;

            }
            if(num!=0){
                
            }
        }while (num!=0);{
            System.out.println("\nResultats:");
            System.out.println("Quantitat de positius: " + pos);
            System.out.println("Suma de positius: " + sumpos);
            System.out.println("Quantitat de negatius: " + neg);
            System.out.println("Suma de negatius: " + sumneg);
        }
        input.close();
    }
}
