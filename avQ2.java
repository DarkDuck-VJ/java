import java.util.Scanner;
public class avQ2 {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String arg[]){
        float nota1, nota2, mediaF;
        System.out.print("Informe a nota de matemática do aluno.");
        nota1=leia.nextFloat();
        System.out.print("Informe a nota de portugues do aluno.");
        nota2=leia.nextFloat();
        mediaF=(nota1+nota2)/2;
        if (mediaF>=7){
            System.out.print("aprovado");
        } else{
            System.out.print("Reprovado");
        }
    }
}
