import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Poupança conta1 = new Poupança();
        conta1.saldo = 100f;

        //Aplicando scanner do deposito:
        //Tratando Exceção
        float deposito = 0;
        boolean valor = false;

        while (!valor){
        try {
            System.out.printf("\nDigite o valor depositado: ");
            deposito = sc.nextFloat();
            valor = true;
        }

        catch (Exception e){
            System.out.printf("\n\nValor digitado de forma incorreta!");
            sc.nextLine(); //Esvaziando o buffer do scanner
            }
        }
        conta1.despositar(deposito);//metodo da classe mãe

        //Aplicando scanner no redimento:
        //Tratando exceção
        float render = 0;
        boolean valor2 = false;

        while (!valor2){
        try{
            System.out.printf("\n\nDigite o valor do rendimento: ");
            render = sc.nextFloat();
            valor2 = true;
        
        }

        catch (Exception e){
            System.out.printf("\n\nValor digitado de forma incorreta!");
            sc.nextLine();//Esvaziando o buffer do scanner
            }
        }
        conta1.rendimento(render);//metodo da classe filha
    }
}
