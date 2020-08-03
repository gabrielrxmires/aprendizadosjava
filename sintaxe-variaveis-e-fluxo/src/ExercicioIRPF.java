import java.util.Scanner;

public class ExercicioIRPF {
	public static void main(String[] args) {
		//programa para calcular dedução do IRPF utilizando estruturas condicionais (IF/ELSE)
		
		double salario = 0;
		System.out.println("Qual o seu salario?");
		Scanner sc = new Scanner(System.in);
		salario = sc.nextInt();
		
		if(salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("o IR é de 7,5% e vc pode deduzir R$142,00");
		}else {
			if(salario > 2800.0 && salario <= 3751.0) {
			System.out.println("o IR é de 15% e vc pode deduzir R$350,00");
			}else {
				if(salario > 3751.0 && salario <= 4664.0) {
				System.out.println("o IR é de 22,5% e vc pode deduzir R$636,00");
				}
			}
		}
	}
}
