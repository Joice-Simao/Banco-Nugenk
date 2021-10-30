package entities;

public class ContaEmpresa extends Conta{
	
		//atributos
		private	double	emprestimoEmpresa;
	
		//construtores
		public ContaEmpresa(int numero, String cpf, double emprestimoEmpresa) {
			super(numero, cpf);
			this.emprestimoEmpresa = emprestimoEmpresa;
		}
		
		//encapsulamento
		public double getEmprestimoEmpresa() {
			return emprestimoEmpresa;
		}

		public void setEmprestimoEmpresa(double emprestimoEmpresa) {
			this.emprestimoEmpresa = emprestimoEmpresa;
		}
		
		//metodos
		public void pedirEmprestimo(double valorSolicitado)
		{
			if(valorSolicitado < emprestimoEmpresa) {
			this.emprestimoEmpresa -= valorSolicitado;
			super.credito(valorSolicitado);
			System.out.println("Saldo atual empr�stimo R$ "+this.emprestimoEmpresa);
			System.out.println("Empr�stimo realizado com sucesso.\nSaldo atualizado: R$ " +getSaldo());
			}
		}
			
	
}