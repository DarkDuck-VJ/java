import java.util.Scanner;
public class avaliaçaoDoAluno {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String args[]){
        float nota1, nota2, media;
        System.out.print("Digite a primeira nota.");
        nota1=leia.nextFloat();
        System.out.print("Digite a segunda nota.");
        nota2=leia.nextFloat();
        media=(nota1+nota2)/2;
        if (media>=7){
            System.out.println("O aluno foi aprovado");
        }else{
            System.out.println("O aluno foi reprovado");
        }
    }
    
}
