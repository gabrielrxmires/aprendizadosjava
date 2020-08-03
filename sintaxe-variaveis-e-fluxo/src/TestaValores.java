
public class TestaValores {

	public static void main(String[] args) {
		int primeiro = 5;
		int segundo = 7;
		
		segundo = primeiro;
		primeiro = 10;
		
		//a variável segundo vale o 5 q foi armazenado na linha 8 do cód
		
		System.out.println(segundo);

	}

}
