package exerciciosFundamentos; 
import java.util.Scanner;

public class CalcularArea {
		
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual a altura do triangulo?");
		double altura = entrada.nextDouble();
		
		System.out.println("Qual a base do triangulo?");
        double base = entrada.nextDouble();
        
		double area = (base * altura) / 2;
		System.out.println("A área do triângulo é: " + area);
		
		
		entrada.close();
		
	}	
}
