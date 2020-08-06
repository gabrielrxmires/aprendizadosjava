import javax.swing.JOptionPane;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0; //static quer dizer da classe, e não do objeto
	
	public Conta(int agencia, int numero) {
		Conta.total++;
		System.out.println("o total de conts eh>" + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta");
	}

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
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	public int getAgencia() {
		return agencia;
	}
	public double getSaldo() {
		return saldo;
	}

	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			JOptionPane.showMessageDialog(null, "Não pode valor negativo!");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public static int getTotal() {
		return Conta.total;
	}

}
