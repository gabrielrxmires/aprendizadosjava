
public class TestaBanco {
	public static void main(String[] args) {
		Cliente gabriel = new Cliente();
		gabriel.nome = "gabriel";
		gabriel.cpf = "222.222.222-xx";
		gabriel.profissao = "programador";
		
		Conta contaDoGabriel = new Conta();
		contaDoGabriel.deposita(200);
		
		contaDoGabriel.titular = gabriel;
		System.out.println(contaDoGabriel.titular.nome);
	}
}
