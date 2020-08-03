
public class TestaCondicional2 {
	public static void main(String[] args) {
		System.out.println("testando condicionais");

		int idade = 19;
		int quantidadePessoas = 1;
		boolean acompanhado = quantidadePessoas > 1;
		
		System.out.println("Valor de acompanhado = " + acompanhado);
		if (idade >= 18 && acompanhado) {
			System.out.println("seja bem vindo!");
		} else
			System.out.println("infelizmente vc n pode entrar");
	}

}
