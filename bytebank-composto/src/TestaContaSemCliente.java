
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contaDoBiel = new Conta();
		System.out.println(contaDoBiel.getSaldo());
		
		contaDoBiel.titular = new Cliente();
		System.out.println(contaDoBiel.titular);
		contaDoBiel.titular.nome = "Biel";
		System.out.println(contaDoBiel.titular.nome);
	}
}
