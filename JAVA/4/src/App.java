public class App {
    public static void main(String[] args) throws Exception {
         // criando um obj//

         celular22 celularA = new celular22();
         celularA.modelo = "S26";
         celularA.fabricante = "Samsung";
         celularA.tela = 6.4f;

         //exibir
         celularA.exibir();

         //ligação
         celularA.ligação("Augusto");

         //mensagem
         celularA.mensagem("Augusto", "Bom dia");

         //foto
         celularA.foto(15.5f);

         //carregar
         celularA.carregar(99);
    }
}
