package Modulo_1;

public class Operacoes_avancadas_e_matematicas {

	public static void main(String[] args) {
		int vida1= 10;
		int vida2 = 20;
		int vida3 = 30;
		
		int vida_final_1 = vida1 + vida2;
		int vida_final_2 = vida1 + vida3;
		
		int vida_final_3 = vida3 - vida1;
		int vida_final_4 = vida2 - vida1;
		
		int vida_final_5 = vida2 * vida1;
		int vida_final_6 = vida3 * vida1;
		
		int vida_final_7 = vida3 / vida1;
		int vida_final_8 = vida2 / vida1;
		
		System.out.println(vida_final_1);
		System.out.println(vida_final_2);
		System.out.println(vida_final_3);
		System.out.println(vida_final_4);
		System.out.println(vida_final_5);
		System.out.println(vida_final_6);
		System.out.println(vida_final_7);
		System.out.println(vida_final_8);
		
		if (vida1 == 100 && vida2 == 20) {
			System.out.println("certo 1");
		}else if( vida1 == 100 || vida2 == 20) {
			System.out.println("certo 2");
		}
		
		

	}

}
