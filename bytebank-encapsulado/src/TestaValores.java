
public class TestaValores {
	public static void main(String[] args) {
		
		Conta c = new Conta(100, 13131313);
		Conta c1 = new Conta(100, 12121212);
		
		System.out.println(c.getAgencia());
		System.out.println(Conta.getTotal());

	}
}
