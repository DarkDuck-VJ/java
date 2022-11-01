import java.util.Scanner;
public class tdQ12 {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String arg[]){
        float valor1, valor2;
        System.out.print("Digite o primeiro valor.");
        valor1=leia.nextFloat();
        System.out.print("Digite o segundo valor.");
        valor2=leia.nextFloat();
        if(valor1>valor2){
            System.out.print(valor1);
            System.out.println(valor2);
        }else{
            System.out.print(valor2);
            System.out.println(valor1);
        }
    }
}