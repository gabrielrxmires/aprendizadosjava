
public class TestaCaracteres {
	
	public static void main(String[] args) {
		char letra = 'a'; //char - aspas simples - ''
		System.out.println(letra);
		
		char valor = 66; //o char 66 retorna a letra b, pois na tabela unicode/ascii corresponde a letra b.
		System.out.println(valor);
		
		valor = (char) (valor + 3);
		System.out.println(valor);
		
		String palavra = "Alura cursos online de tecnologia"; //string = aspas duplas = " "
		System.out.println(palavra);
		
		palavra = palavra + 2020; //concatenação de duas strings, a saída será o declarado na variável palavra + 2020.
		System.out.println(palavra);
		
		
	}
}
