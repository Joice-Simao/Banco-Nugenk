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
			System.out.println("Saldo atual empréstimo R$ "+this.emprestimoEmpresa);
			System.out.println("Empréstimo realizado com sucesso.\nSaldo atualizado: R$ " +getSaldo());
			}
		}
			
	
}