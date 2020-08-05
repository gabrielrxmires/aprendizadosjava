package bytebank;

public class TestaMetodo {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		Conta c2 = new Conta();
		c1.deposita(1700);
		c2.deposita(1000);

		c1.saca(155);
		c1.deposita(300);

		if(c2.transfere(1001, c1)) {
			System.out.println("transferencia concluida com sucesso!");
		} else{
			System.out.println("faltou dinheiro");
		}
			

	}
}
