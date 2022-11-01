import java.util.Scanner;
public class salario2 {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String arg[]){
        int qtdAnos, horasT;
        float salarioF, valorH, salario;
        System.out.println("A quantos anos você trabalha em nossa empresa?");
        qtdAnos=leia.nextInt();
        System.out.println("Quanto tempo você trabalha por dia?");
        horasT=leia.nextInt();
        if (qtdAnos<1){
            salarioF=1500;
            valorH=50;
            salario=salarioF+valorH*horasT;
            System.out.println("Seu salário será de:R$"+salario);
        } else if((qtdAnos>=1) && (qtdAnos<3)){
            salarioF=2000;
            valorH=100;
            salario=salarioF+valorH*horasT;
            System.out.println("Seu salário será deR$"+salario);
        } else{
            salarioF=3000;
            valorH=150;
            salario=salarioF+valorH*horasT;
            System.out.println("Seu salário será deR$:"+salario);
        }
    }
}
