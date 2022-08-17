package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
		public static void main(String[] args) {
			
			//Conversão implícita
			double a = 1;
			System.out.println(a);
			
			// Conversão explícita (CAST)
			float b = (float) 1.123456788888; 
			System.out.println(b);
			
			int c = 340;
			byte d = (byte) c; // Conversão explícita (CAST)
			System.out.println(d);
			
			double e = 1.9; 
			int f = (int) e; // Conversão explícita (CAST)
			System.out.println(f); // Ouve perda de informação 
			
		}

}
