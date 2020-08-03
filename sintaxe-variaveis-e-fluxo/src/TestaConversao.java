
public class TestaConversao {
	public static void main(String[] args) {
		double salario = 1234.50;
		float pontoFlutuante = 3.14f;
		int valor = (int) salario; //convertendo o double salario em int, forçando o java a imprimi-lo no sout abaixo.
		System.out.println(valor);
		
		double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2; //double não é recomendado para guardar dinheiros. o valor seria simples: 0.3, porém a variável total retorna 0.30000000004.

        System.out.println(total);
    }
	}

