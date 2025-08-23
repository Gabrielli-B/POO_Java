package POO_IF_Aulas.Exercicios.ExerAssosiacaoAgregacaoComposicaoSobrecarga.SistemaBancario_AGREGACACAO_COM_LIST;

import java.util.Scanner;

public class ContaBancaria {
    private int num;
    private float saldo;
    private Cliente cliente;
    Scanner scanner = new Scanner(System.in);

    public ContaBancaria(int num, Cliente cliente) {
        this.num = num;
        this.cliente=cliente;
        cliente.clientesContasBancarias(this);
        this.saldo = 0;
    }

    public void depositar(float valor){
        if(valor<=0){
            System.out.println("IMPOSSÍVEL! não há como depositar um valor negativo ou nulo");
        }else{
            this.saldo+=valor;
            System.out.println("Valor depositado! Saldo atual : "+this.saldo);
        }
    }
    public void sacar(float valor){
        if(valor<0 ){
            System.out.println("IMPOSSÍVEL! você informou um valor negativo");
        }else if(this.saldo==0 || this.saldo<valor){
            System.out.println("IMPOSSÍVEL! Você não tem saldo suficiente para sacar");
            System.out.println("Saldo em conta: "+this.saldo);
        }else{
            this.saldo-=valor;
            System.out.println("Saque no valor de  "+valor+" RS efetuado com sucesso!");
            System.out.println("Saldo em conta : "+this.saldo+" RS");
        }
    }
    public void transferencia(Cliente clienteOrigem, Cliente clienteDestino,float valor){

        if(!this.cliente.equals(clienteOrigem)){
            System.out.println("Erro! essa conta não pertence ao cliente de origem");
            return;
        }
        if(valor<=0){
            System.out.println("IMPOSSÍVEL! não há como depositar um valor negativo ou nulo");
        }else if(this.saldo<=0 || this.saldo<valor){
            System.out.println("IMPOSSÍVEL! Você não tem saldo suficiente para transferir | Saldo : "+this.saldo);
        }else if(clienteDestino.getContaBancarias().isEmpty()){
            System.out.println("Cliente de destino não possui conta");
            return;
        }else{
            ContaBancaria contaDestino = clienteDestino.getContaBancarias().get(0);
            this.saldo-=valor;
            contaDestino.depositar(valor);
            System.out.println("| Dados da transação |");
            System.out.println("Conta de origem => "+clienteOrigem.getNome()+ " | "+ this.num+" === "
                                +"Descontado RS "+valor+" | Saldo atual : "+this.saldo);
            System.out.println("------------------------------------------------------");
            System.out.println("Conta destino => "+clienteDestino.getNome()+" | "+contaDestino.num + " === "
                                +"Valor que entrou RS "+valor+" | Saldo atual "+contaDestino.saldo);

        }
    }

    //TALVEZ IMPLEMENTAR ESCOLHA DE USUÁRIO
    /*public float scannerFloat(){
        System.out.println("Informe o valor: ");
        return scanner.nextFloat();
    }
    public String scannerString(){
        System.out.println("Informe o CPF: ");
        return scanner.nextLine();
    }
    public int scannerInt(){
        System.out.println("Informe o número da conta: ");
        return scanner.nextInt();
    }

    public float getSaldo() {
        return saldo;
    }*/
}
