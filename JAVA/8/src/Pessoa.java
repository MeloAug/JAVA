public class Pessoa {

    float nota;
    int presença;

    //Método aplicarnota
    public void aplicarnota (float nota) {
        if (nota >=0) {
            this.nota = nota;
            System.out.printf("\n\nOperação realizada| Nota: %.1f", this.nota);
        }
        else{
            System.out.printf("\n\nOperação não realizada");
        }
    }

    //Método aplicarpresença
    public void aplicarpresença (int presença) {
        if (presença > 0) {
            this.presença = presença;
            System.out.printf("\n\nOperação realizada| Presença: %d", this.presença);
        }
        else {
            System.out.printf("\n\nNão realizada| Presença: %d", this.presença);
        }
    }

}

class Aluno extends Pessoa {
    public void aplicarbonus (float bonus) {
        if (presença > 20) {
            bonus = bonus / 100; //transfomando em decimal
            nota += nota * bonus;
            System.out.printf("\n\nOperaçao realizada|Nota final (nota+Bonus): %.1f", nota);

        }
        else {
            System.out.printf("\n\nOperação não realizada| Nota final: %.1f", nota);
        }   
    }
}