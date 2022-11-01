import java.util.Scanner;

import java.util.Scanner;
public class ifAninhado {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String arg[]){
        int primeiro, segundo, terceiro, maior;
        System.out.println("Digite o valor do primeiro.");
        primeiro=leia.nextInt();
        System.out.println("Digite o valor do segundo.");
        segundo=leia.nextInt();
        System.out.println("Digite o valor do terceiro.");
        terceiro=leia.nextInt();
        if (primeiro>=segundo){
            if (primeiro>=terceiro){
                maior=primeiro;
            }else{
                maior=terceiro;
            }
        }else{
            if(segundo>=terceiro){
                maior=segundo;
            }else{
                maior=terceiro;
            }
        }System.out.println("O maior número é:"+maior);
    } 
}
