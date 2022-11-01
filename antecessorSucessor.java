import java.util.Scanner;
public class antecessorSucessor{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        float numero, antecessor, sucessor; 
        System.out.print("Digite o número.");
        numero=leia.nextFloat();
        antecessor=numero-1;
        sucessor=numero+1;
        System.out.println("Você digitou" + numero);
        System.out.println("O antecessor deste número é" + antecessor);
        System.out.println("E o sucessor é:" + sucessor);
    } 
}
