import java.util.Scanner;
public class maiorDe2 {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String arg[]){
        int primeiro, segundo;
        System.out.println("Digite o primeiro.");
        primeiro=leia.nextInt();
        System.out.println("Digite o segundo.");
        segundo=leia.nextInt();
        if (primeiro>segundo){
        System.out.println("O maior é:"+primeiro);
        }else if(primeiro==segundo){
            System.out.println("Os dois são iguais");
        }else{
            System.out.println("O maior é"+segundo);
        }
    }
}
