package entities;

public class ContaCorrente extends Conta {

    //atributos
    private int contadorTalao;

    public ContaCorrente(int numero, String cpf, int contadorTalao) {
        super(numero, cpf);
        this.contadorTalao = contadorTalao;
    }
    //encapsulamento

    public int getContadorTalao() {
        return contadorTalao;
    }

    public void setContadorTalao(int contadorTalao) {
        this.contadorTalao = contadorTalao;
    }


    //metodos
    public void talao(int quantidadeTalao) {
        for(int x=3;x<=quantidadeTalao;x++) {
            if(super.getSaldo()>=30.00) {
                contadorTalao++;
            }
            else {
                System.out.println("Sem saldo para retirada de tatão de cheque !!! ");
            }
        }
    }
}
