package exerciciosFundamentos;
import java.util.Scanner;

public class Elevacao {
		
	public static void main(String[] args) {
	      Scanner entrada = new Scanner(System.in);
	      
	      System.out.println("Qual é o número: ");
	      double numero = entrada.nextDouble();
	      
	      double resultado1= Math.pow(numero , 2);
	      double resultado2 = Math.pow(numero , 3);
	      
	      System.out.println("Resultado ao quadrado: " + resultado1);
	      System.out.println("Resultado ao cubo: " + resultado2);
	      
	      
	      entrada.close();
    }
}
