import java.util.Scanner; //Classe Scanner -> leitura do teclado
public class App {
    public static void main(String[] args) throws Exception {

        //Instanciando/iniciando a classe de Scanner

        Scanner sc = new Scanner(System.in); 
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Augusto";
        conta1.agencia = "0011";
        conta1.conta = "100x";
        conta1.saldo = 780;

        conta1.exibir();
        conta1.depositar(10);

        //Transferência via Scanner

        System.out.printf("\n\nDigite o valor e agência e conta de desino: ");
        float tranferir = sc.nextFloat();
        String agenciad = sc.next();
        String contad = sc.next();

        conta1.tranferencia(tranferir, agenciad, contad);

        //Saquê via Scanner

        System.out.printf("\n\nDigite o valor do sacar: ");
        float saque = sc.nextFloat();

        conta1.sacar(saque);
        
    }
}
