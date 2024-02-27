package Modulo_1;

public class Loopings {

	public static void main(String[] args) {
		int contador = 0;
		int contador1 = 0;
		
		Loopings loop = new Loopings();
		
		while(contador < 11) {
			System.out.println(contador);
			contador +=  1;
					//ou
			//contador ++;
		}
		
		for(int i = 0; i <11; i++) {
			System.out.println(i);
		}
		
		
		do {
			System.out.println("contador: " + contador1);
			contador1 ++;
		}while(contador < 11);
	
	}
}
