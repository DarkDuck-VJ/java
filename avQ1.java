import java.util.Scanner;
public class avQ1 {
    public static Scanner leia=new Scanner(System.in);
    public static void main(String arg[]){
        int tecla, ant, suc;
        System.out.print("Tecle um número.");
        tecla=leia.nextInt();
        System.out.println(tecla);
        ant=tecla-1;
        suc=tecla+1;
        System.out.println("O antecessor desta tecla é:" + ant +"E o sucessor é:" + suc);
    }

}
