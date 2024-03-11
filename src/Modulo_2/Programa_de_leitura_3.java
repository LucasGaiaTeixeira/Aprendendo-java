package Modulo_2;
import java.util.Random;
import java.util.Scanner;


public class Programa_de_leitura_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		String nome;
		char escolhaNS;
		char escolhaAD = 'p';
		int numero = 0;
		
		int ataque_player = 10;
		int ataque_inimigo = 30;
		
		int vida_Player = 50;
		int vida_Enemy = 50;
		//int numero = rand.nextInt(100);
		//System.out.println();
		
		System.out.println("Seja bem vindo ao jogo!");
		System.out.print("Digite seu nome: ");
		nome = scan.nextLine();
		System.out.println("Bem vindo ao jogo "+nome+" tente sobreviver");
		
		System.out.print("Você caiu dentro de uma caverna e desmaiou.\n Quando você acorda apenas encotrar a luz do ceu do buraco que você caiu e enconta 2 caminhos.\n Qual você escolherá?");
		System.out.println("   'N' para o norte, e 'S' para o sul ");
		
		escolhaNS = scan.next().charAt(0);
		
		while(escolhaNS != 's'|| escolhaNS != 'n') {
			if(escolhaNS == 's') {
				break;
			}else if(escolhaNS =='n') {
				break;
			}
			System.out.println("digite 'n' para ir para o norte e 's'  para ir para o sul");
			escolhaNS = scan.next().charAt(0);
		}
		
		if(escolhaNS == 'n') {
			System.out.println("voce encontrou um bau, quer tentar abri-lo?");
			System.out.println(" 'o' para abrir e 'd' para deixar o bau!");
			escolhaAD = scan.next().charAt(0);
			while(escolhaAD == 'o' || escolhaAD == 'd') {
				System.out.println("coloque  'o' para abri o bau  e 'd ' para deixar o bau");
				if(escolhaAD == 'o') {
					ataque_player += 50;
					break;
				}else if(escolhaAD == 'd') {
					break;
				}
			}
		}
		
		if(escolhaNS == 'n') {
			System.out.print("Você foi para o norte, você encontrou um ciclope!\n Como quer enfrenta-lo? ");
			System.out.println("ele é enorme, elhe assusta um pouco, mas você percebe uma saída atras dele.\n Oque quer fazer?");
			System.out.println("  ' at' para atacar e 'f' para fugir   " );
			while(escolhaAD == 'a' || escolhaAD == 'f') {
				if(escolhaAD == 'a') {
					if(rand.nextInt(ataque_player) < rand.nextInt(ataque_inimigo)) {
						System.out.println("você o acertou e o matou, e saiu do labirinto");
						System.out.println("você ganhou o jogo parabens!!");
						break;
					}else {
						System.out.println("ele te acertou, e você morreu");
						System.out.println("Fim de jogo.");
						break;
					}
				
			
		
		
			}else if(escolhaAD == 'f') {
					System.out.println("você escolheu fugir");
					if(rand.nextInt(100) < 75) {
						System.out.println("ele te acertou e vc morreu");
						System.out.println("Você perdeu!!");
						System.out.println("Fim de jogo.");
						break;
					}else {
						System.out.println("Você desviou e conseguiu fugir");
						System.out.println("Parabens, você ganhou o jogo!!!!");
						break;
							}
				}   
		
	         
		}		
		}
		
	}
}