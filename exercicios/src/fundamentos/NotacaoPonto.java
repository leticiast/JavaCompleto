package fundamentos;

public class NotacaoPonto {

		public static void main(String[] args) {
			
			String s = "Bom dia!";  
			s = s.replace("dia!", "final de semana!");
			s = s.toUpperCase();
			s = s.concat("!!!");
				
			System.out.println(s);
			
			// Tipos primitivos não tem operador "." 
		}
}
