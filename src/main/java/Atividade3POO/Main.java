public class Main {

	public static void main(String[] args) {
		Conta itau = new Corrente();
		itau.setBanco(341);
		itau.setAgencia(2332);
		itau.setNumeroConta(165);
		itau.setTitular("Luis Henrique");
		System.out.println(itau);
		itau.depositar(300);
		System.out.println("saldo é : "+itau.getSaldo());
		
		// 
		Poupanca caixa = new Poupanca();
		caixa.setBanco(104);
		caixa.setAgencia(2332);
		caixa.setNumeroConta(165);
		caixa.setTaxaMes(0.07);
		caixa.setTitular("Luis Henrique");
		
		caixa.depositar(200);
		System.out.println(caixa);
		caixa.depositar(300);
		System.out.println("saldo é : "+caixa.getSaldo());
		System.out.println("O rendimento mensal é "+caixa.verificarRendimentoMensal());
		// TODO Auto-generated method stub

	}

}
