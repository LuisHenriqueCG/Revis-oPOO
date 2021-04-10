/* classe declarada como abstrata

para instanciar crie uma conta corrente ou uma conta poupança
*/ 

public abstract class Conta {
	private int banco;
	private int agencia;
	private int numeroConta;
	private double valorTotal;
	private String titular;
	
	public int getBanco() {
		return banco;
	}
	
	public void setValorTotal( double valor ) {
		this.valorTotal = valor;
	}

	public void setBanco(int banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public double getSaldo() {
		return this.valorTotal;
	}

	public String toString() {
		return "Banco   :" + this.getBanco() + "\n" + 
	           "Agência :" + this.getAgencia() + "\n" + 
			   "C/C     :" + this.getNumeroConta() +"\n" +
	           "Cliente :" + this.getTitular() ;
	}
	public boolean sacar( double valor_saque) {
		if (valor_saque > this.getSaldo() ) {
			this.valorTotal = this.getSaldo() - valor_saque;
			return true;
		} else {
			return false;
		}
	}
	
	public void depositar( double valor_deposito) {
			this.valorTotal = this.getSaldo() + valor_deposito;
	}
	
	
	public Conta() {
		/* inicializa a conta com valor zero */ 
		this.valorTotal = 0;
		
		// TODO Auto-generated constructor stub
	}

}