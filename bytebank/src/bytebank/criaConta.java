package bytebank;

public class criaConta {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.saldo = 200;

		System.out.println(c1.saldo);

		c1.saldo += 100;
		System.out.println(c1.saldo);

		Conta c2 = new Conta();
		c2.saldo = 300;

		System.out.println("primeira conta tem " + c1.saldo);
		System.out.println("segunda  conta tem " + c2.saldo);

		System.out.println(c2.agencia);
		c1.agencia = 146;
		c2.agencia = 146;
		System.out.println("agora a segunda conta esta " + "na agencia " + c2.agencia);
		
		if(c1 == c2) {
			System.out.println("ok");
		}else {
			System.out.println("xii");
		}
		
		System.out.println(c1);
		System.out.println(c2);

	}

}
