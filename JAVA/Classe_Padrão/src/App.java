public class App {
    public static void main(String[] args) {
        // criando um obj//

        Celular celularA = new Celular();
        celularA.nome = "S26";
        celularA.fabricante = "Samsung";
        celularA.SO = "Android";
        celularA.tela = 6.4f;
        celularA.HD = 128;

        Celular celularB = new Celular();
        celularB.nome = "Iphone 17";
        celularB.fabricante = "Apple";
        celularB.SO = "IOS";
        celularB.tela = 8.9f;
        celularB.HD = 500;

        System.out.format("Celular 1: %s - Fabricante %s%n - SO %s, com %dGB e tela de %.1f%n", celularA.nome,
                celularA.fabricante, celularA.SO, celularA.HD, celularA.tela);

        System.out.format("Celular 2: %s - Fabricante %s%n - SO %s, com %dGB e tela de %.1f%n", celularB.nome,
                celularB.fabricante, celularB.SO, celularB.HD, celularB.tela);
    }
}

 class Celular {
    String nome;
    String fabricante;
    String SO;
    int HD;
    float tela;
 
    public Celular() {
    }
 }
 