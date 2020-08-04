package bytebank;

public class Conta {
	double saldo;
	int agencia = 42;
	int numero;
	String titular;

	void deposita(double valor) {
		this.saldo += valor;
		System.out.println("depositado! saldo atual: R$" + saldo);
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("dinheiro sacado! saldo atual: R$" + this.saldo);
			return true;
		}
		return false;
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} return false;
	}

}
