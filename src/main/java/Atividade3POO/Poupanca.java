public class Poupanca extends Conta {
	private int validador;
	private double taxaMes;
	private int diaVencimento;
	

	public int getValidador() {
		return validador;
	}


	public void setValidador(int validador) {
		this.validador = validador;
	}


	public double getTaxaMes() {
		return taxaMes;
	}


	public void setTaxaMes(double taxaMes) {
		this.taxaMes = taxaMes;
	}


	public int getDiaVencimento() {
		return diaVencimento;
	}


	public void setDiaVencimento(int diaVencimento) {
		this.diaVencimento = diaVencimento;
	}


	public double verificarRendimentoMensal( ) {
		return this.getSaldo() * this.getTaxaMes();
	}
	public String toString() {
		return (super.toString()+ "\n" + 
				"Validador :"+ this.getValidador()+"\n" +
				"Taxa      :"+ this.getTaxaMes()+"\n"  + 
				"DiaVenc   :"+ this.getDiaVencimento() );
	}
	public Poupanca() {
		// TODO Auto-generated constructor stub
	}

}