package exerciciosFundamentos;
import java.util.Scanner;

public class ResultadoIMC {
	
		public static void main(String[] args) {
 	       
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu peso:");
		double peso = entrada.nextDouble();
		
		System.out.println("Digite sua altura:");
		double altura = entrada.nextDouble();
		
		double imc = peso / (altura * altura);
		System.out.print("O IMC É: " + imc);
		
		entrada.close();
		
	  }

}
