
public class TestaGetESet {
	public static void main(String[] args) {
		Conta c = new Conta(100, 123456);
		
		
		System.out.println(c.getNumero());
		
		Cliente gabriel = new Cliente();
		gabriel.setNome("Gabriel");
		c.setTitular(gabriel);
		
		System.out.println(c.getTitular().getNome());
		
		c.getTitular().setProfissao("desenvolvedor");
		System.out.println(c.getTitular().getProfissao());
	}
}
