import java.util.Scanner;
public class salarioReajuste{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        int salario, porcentagem,  valorFinal;
        System.out.print("Digite o valor do seu salário.");
        salario=leia.nextInt();
        System.out.print("Digite o valor da porcentagem do reajuste.");
        porcentagem=leia.nextInt();
        valorFinal=(salario+(salario*porcentagem)/100);
        System.out.println("O valor reajustado do seu selário será: R$"+ valorFinal);
    }
}