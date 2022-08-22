package exerciciosFundamentos;
import java.util.Scanner;

public class ConversaoCelsius {
		
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor de Celsius: ");
		double celsius = entrada.nextDouble();
		
		double conversao = celsius * 1.8 + 32;
		System.out.println("O resultado é: " + conversao);
		
		entrada.close();
	}
}
