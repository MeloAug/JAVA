public class Conta { //classe mãe

    public float saldo; //atributo classe mãe
    
    //Método deposito

    public void despositar(float deposito){
if (deposito > 0){
    saldo += deposito;
    System.out.printf("Voce depositou: R$ %.2f |Seu saldo é: R$ %.2f",deposito, saldo);
} else{
    System.out.printf("Sem deposito");
}
    }
}

//Classe filha
class Poupança extends Conta {//classe poupança herda classe conta
    //Método render

    public void rendimento(float render){
        if (render > 0){
            render = render/100;
            saldo += saldo * render;
        System.out.printf("\n\nOperação realizada|Saldo final (Saldo+Rendimento): R$ %.2f", saldo);
        }
        else{
            System.out.printf("\n\nOperação não realizada|Saldo final: R$ %.2f", saldo);
        }
    }
}
