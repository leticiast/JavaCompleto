package exerciciosFundamentos;
import java.util.Scanner;

public class ConversaoFahrenheit {
	
	public static void main(String[] args) {
		  Scanner entrada = new Scanner(System.in);
		  
		  System.out.println("Digite a temperatura em Fahrenheit: ");
		  double fahrenheit = entrada.nextDouble();
		 
		  double conversao = fahrenheit * 1.8 + 32;
		  System.out.println("Valor de Celsius: " + conversao);
		  
		 entrada.close();
		 
	}	 
}
