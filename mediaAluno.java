import java.util.Scanner;
public class mediaAluno {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String arg[]){
        float nota1, nota2, nota3, mediaFinal;
        System.out.print("Informe a nota de matemática do aluno.");
        nota1=leia.nextFloat();
        System.out.print("Informe a nota de portugues do aluno.");
        nota2=leia.nextFloat();
        System.out.print("Informe a nota de biologia do aluno.");
        nota3=leia.nextFloat();
        mediaFinal=(nota1*2+nota2*3+nota3*5)/10;
        System.out.println("A média do aluno foi de" + mediaFinal);
    }
}
