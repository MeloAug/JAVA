public class Aluno {

    //Define os atributos

    String nome;
    int idade;
    double nota1;
    double nota2;

    //Método que calcula media das notas:

public double média(){

    return (nota1+nota2)/2;
}

//Método para exibir os atributos do aluno
public void exibir(){
    System.out.println("Nome: "+nome);
    System.out.println("Idade: "+idade);
    System.out.println("média: "+média());
}
}