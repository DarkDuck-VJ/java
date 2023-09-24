import java.util.Scanner;
public class BalancoTrimestral{
    public static Scanner leia=new Scanner(System.in);
    private int gastoJaneiro; 
    private int gastoFevereiro;
    private int gastoMarco;
    private int total; 
    private int media; 
    public static void main(String args[]){
        BalancoTrimestral balanco = new BalancoTrimestral();

        balanco.setTotalMedia(15000, 23000, 17000);
        balanco.saidaGastos();

    }
    public void setTotalMedia(int gastoJaneiro, int gastoFevereiro, int gastoMarco){
        this.gastoJaneiro = gastoJaneiro;
        this.gastoFevereiro = gastoFevereiro;
        this.gastoMarco = gastoMarco;
        this.total = (this.gastoJaneiro+this.gastoFevereiro+this.gastoMarco);
        this.media = ((this.gastoJaneiro+this.gastoFevereiro+this.gastoMarco)/3);
    }
    public int getTotal(){
        return total;
    }
    public int getMedia(){
        return media;
    }
    public  void saidaGastos(){
        System.out.println("O valor total do gasto trimestral e: R$ "+getTotal());
        System.out.println("A media gasta mensalmente e: R$"+getMedia());
    }
}