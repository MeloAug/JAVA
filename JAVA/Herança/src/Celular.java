//Classe mãe
public class Celular {
    
    //Método ligar:

    public void ligar(){
        System.out.printf("\n\nO celular esta ligando.");

    }
    
    //Método carregar
    public void carregarBateria(){
        System.out.printf("O celular está carregando");
    }
 }

//Classe filha
class smartphone extends Celular {
    //A classe smartphone herda da classe celular

    public void mensagem(){
        System.out.printf("\n\nO Smartphone está enviando uma mensagem");
    }
}