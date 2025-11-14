import java.util.Scanner;
public class ex_exam2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Benvingut/da al Joc pesre-paper-tisores. \nIntrodueix el teu nom: \nEscull una opció: \n0-Pedra \n1-Paper \n2-Tisores");
        String nom = input.nextLine();
        int opció = input.nextInt();
        int aleat = (int)(Math.random()*3);
        switch (opció) {
            case 1:
                if (opció == aleat)
                System.out.println("L' ordinador ha tret Pedra "+nom+" ha tret Pedra. És un empat");
                else if (opció != aleat){
                    System.out.println("L' ordinador ha tret "+aleat+" "+nom+" ha tret Pedra. Guanyat");
                }
                break;
                case 2:
                if (opció == aleat)
                System.out.println("L' ordinador ha tret Pedra "+nom+" ha tret Pedra. És un empat");
                else if (opció != aleat){
                    System.out.println("L' ordinador ha tret "+aleat+" "+nom+" ha tret Paper. Guanyat");
                }
                break;
                case 3:
                if (opció == aleat)
                System.out.println("L' ordinador ha tret Pedra "+nom+" ha tret Pedra. És un empat");
                else if (opció != aleat){
                    System.out.println("L' ordinador ha tret "+aleat+" "+nom+" ha tret Tissores. Guanyat");
                }
                break;
            default:
            System.out.println("Selecció no válida escull l'altra cop");
                break;
        }
        input.close();
    }
}
