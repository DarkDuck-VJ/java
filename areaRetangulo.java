import java.util.Scanner;
public class areaRetangulo{
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        float base, altura, area;
        System.out.print("Digite a base do retângulo.");
        base=leia.nextFloat();
        System.out.print("Digite a altura do retângulo.");
        altura=leia.nextFloat();
        area=base*altura;
        System.out.println("A área do retângulo é:" + area);
    }
}