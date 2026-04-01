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

    public void render(){
       saldo+= saldo *=0.05f;
        System.out.printf("\n\nSaldo final (Saldo+Rendimento): R$ %.2f", saldo);
    }
}
