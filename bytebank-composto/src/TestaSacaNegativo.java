
public class TestaSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(100);
		System.out.println(conta.saca(101));
		System.out.println(conta.getSaldo());
		// proibido (somente acessar o objeto atrav�s dos metodos para q ele n�o seja
		// atribuido.
		// conta.saldo = conta.saldo - 101;
		conta.saca(101);
		System.out.println(conta.getSaldo());
	}
}
