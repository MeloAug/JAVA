public class ContaBancaria {
    
    //Atributos
    public String titular;
    public String agencia;
    public String conta;
    public float saldo;

    //Método exibir:

    public void exibir (){
        System.out.printf("Titular: %s| Agência: %s|Conta: %s|Saldo: R$ %.2f", titular, agencia, conta, saldo);
    }

    //Método depósito:

    public void depositar(float deposito){
        if (deposito > 0){
            saldo += deposito;
            System.out.printf("\n\nOperação concluida!|Deposito: R$ %.2f|Saldo atual: R$ %.2f", deposito, saldo);
        } else {
            System.out.printf("\n\nOperação indisponivel! - Valor incorreto|Saldo atual: R$ %.2f",saldo);
        }
    }
    //Método tranferência:
    //Não pode ser maior que o saldo
    //exibir o valor tranferido, agencia e conta de destino e saldo atual
    //Caso contrario = exibir a mensagem "operação não realizada - saldo insuficiente" e mostrar saldo atual
    public void tranferencia(float tranferir, String agenciad, String contad){
    if (tranferir <= saldo){
        saldo -= tranferir;
        // Adicionamos %s para agência e %s para conta na String:
        System.out.printf("\n\nTransferencia concluida!: R$ %.2f\n|Para agencia: %s |Conta de destino: %s |Saldo atual: R$ %.2f", 
                          tranferir, agenciad, contad, saldo);
    } else {
        System.out.printf("\n\nOperação não realizada - saldo insuficiente|Saldo atual: R$ %.2f", saldo);
    }
        }
    //Método Saquê
    public void sacar(float saque){
        if (saque <= saldo){
            saldo -= saque;
            System.out.printf("\n\nSaquê Concluido!: R$ %.2f|Saldo Atual: R$ %.2f", saque, saldo);
        } else{
            System.out.printf("Saldo insufiente!");
        }
     }
}

