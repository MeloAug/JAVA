public class App {
    public static void main(String[] args) throws Exception {
        //Criando o primeiro alumo

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Lucas";
        aluno1.idade = 17;
        aluno1.nota1 = 7.3;
        aluno1.nota2 = 5;

        //Exibindo os dados do aluno

        aluno1.exibir();
    }
}
