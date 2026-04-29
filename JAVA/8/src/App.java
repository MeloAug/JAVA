import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Aplicando Scanner
        Scanner sc = new Scanner(System.in);
        Aluno aluno1 = new Aluno();

        System.out.printf("\nDigite a nota: ");
        float nota = sc.nextFloat();
        aluno1.aplicarnota(nota);
        
        System.out.printf("\n\nDigite a quantidade de Presnça: ");
        int presença = sc.nextInt();
        aluno1.aplicarpresença(presença);

        System.out.printf("\n\nDigite o Bonus: ");
        int bonus = sc.nextInt();
        aluno1.aplicarbonus(bonus);
    }
}
