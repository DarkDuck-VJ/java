import java.util.Scanner;
public class tdQ13 {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String arg[]){
        float valor1, valor2, valor3;
        System.out.print("Digite o primeiro valor.");
        valor1=leia.nextFloat();
        System.out.print("Digite o segundo valor.");
        valor2=leia.nextFloat();
        System.out.print("Digite o terceiro valor.");
        valor3=leia.nextFloat();
        if ((valor2 < valor1) && (valor1 > valor3)) {
            System.out.println(valor1);
        }
        else if ((valor1 < valor2) && (valor2 > valor3)) {
            System.out.println(valor2);
        } else{
            System.out.println(valor3);
        }
    }
}
