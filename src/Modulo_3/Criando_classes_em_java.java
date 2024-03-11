package Modulo_3;

public class Criando_classes_em_java {

	public static void main(String[] args) {
		Player player = new Player();
		Inimigo inimigo = new Inimigo();
		
		System.out.println(new Player().vida);
		
		System.out.println(player.vida);
		player.perderVida();
		System.out.println(player.vida);
	}

}
