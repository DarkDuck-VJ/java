import java.util.Scanner;
public class menorIgual0 {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String arg[]){
        int num;
        System.out.println("Digite o número.");
        num=leia.nextInt();
        if (num>0){
            System.out.println("O numero é maior que zero.");
        } else if(num<0){
            System.out.println("O numero é menor que zero.");
        } else{
            System.out.println("O numero é igual a zero.");
        }
    }
}
