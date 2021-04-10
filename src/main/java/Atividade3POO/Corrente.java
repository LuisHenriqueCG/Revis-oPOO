public class Corrente extends Conta {
	private int operacao;
	private double ValorChequeEspecial;
	private boolean permiteCDC;
	

	public int getOperacao() {
		return operacao;
	}


	public void setOperacao(int operacao) {
		this.operacao = operacao;
	}


	public double getValorChequeEspecial() {
		return ValorChequeEspecial;
	}


	public void setValorChequeEspecial(double valorChequeEspecial) {
		ValorChequeEspecial = valorChequeEspecial;
	}


	public boolean isPermiteCDC() {
		return permiteCDC;
	}


	public void setPermiteCDC(boolean permiteCDC) {
		this.permiteCDC = permiteCDC;
	}

	public boolean sacar( double valorSaque) {
		if (valorSaque > this.getSaldo() + this.getValorChequeEspecial() ) { 
			return false;
		} else {
			this.setValorTotal(this.getSaldo()-valorSaque);
			return true;
		}
	}

	public Corrente() {
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return (  super.toString() + "\n" + 
	              "Operação  :" + this.getOperacao() + "\n"  + 
				  "Valor do cheque especial :"+ this.getValorChequeEspecial() + 
				  "Permite CDC : "+(this.isPermiteCDC() ? "" : "Não " )+"Permite CDC") ;
	}

}