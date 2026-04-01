import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Poupança conta1 = new Poupança();
        conta1.saldo = 100f;

        System.out.printf("Digite o valor depositado: ");
        float depositar = sc.nextFloat();
        //conta1.despositar(500f);//método da classe mae
        conta1.despositar(depositar);
        conta1.render();//metodo da classe filha
        
    }
}
