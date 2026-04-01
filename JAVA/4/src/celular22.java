public class celular22 {
    //Definindo atributos

    public String modelo;
    public String fabricante;
    public float tela;
    public float bateria;

    //Método exibir

    public void exibir (){

        System.out.printf("\nModelo:" + modelo + "\nFabricante:" + fabricante + "\nTela:" + tela);
        System.out.printf("\n\nmodelo: %s \nfabricante: %s \ntela: %.1f", modelo, fabricante, tela);
    }

    //Método ligação

    public void ligação(String contato){
        
        System.out.printf("\n\nO %s %s está ligando para %s", fabricante,modelo,contato);
    }

    //Método mensagem

    public void mensagem(String contato, String texto){

        System.out.printf("\n\nO %s %s enviou uma mensagem para %s: %s", fabricante, modelo, contato, texto);
    }

    //Método foto

    public void foto(float resolução){

        System.out.printf("\n\nA câmera utilizada foi de: %.1fMP", resolução);
    }

    //Método carregar

    public void carregar(int  carregador){
        bateria+=carregador;
        if (bateria > 100) {
            bateria = 100;
        }

        System.out.printf("\n\nCarga aplicada: %.1f%% - carga atual: %.1f%%", carregador, bateria);
    }
}