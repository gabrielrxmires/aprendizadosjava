
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Gabriel");
		g1.setCpf("111.111.111-12");
		g1.setSalario(5000);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(10);
		
		boolean autenticou = g1.autentica(0);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());

	}

}
