import java.util.Scanner;
public class areaTriangulo {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        float base, altura, area;
        System.out.print("Digite o valor da base do triângulo.");
        base=leia.nextFloat();
        System.out.print("Digite o valor da altura do triângulo.");
        altura=leia.nextFloat();
        area=(base*altura)/2;
        System.out.println("O valor da área do triângulo é:"+ area);
    }
    
}
