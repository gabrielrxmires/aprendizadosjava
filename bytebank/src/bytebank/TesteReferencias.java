package bytebank;

public class TesteReferencias {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.saldo = 300;
		
		System.out.println("saldo da primeira conta: " + c1.saldo);
		
		Conta c2 = c1; //referencia, não objetos diferentes
		c2.saldo += 100;
		
		System.out.println("saldo da segunda conta: " + c2.saldo);
		System.out.println("saldo da primeira conta " + c1.saldo);
		
		if(c1 == c2) {
			System.out.println("sao a mesmissima coisa");
		}
	}

}
