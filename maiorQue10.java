import java.util.Scanner;
public class maiorQue10 {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String arg[]){
        float valor;
        System.out.print("Digite o valor.");
        valor=leia.nextFloat();
        if (valor>10){
            System.out.println("É MAIOR QUE 10!");
        }else{
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}
