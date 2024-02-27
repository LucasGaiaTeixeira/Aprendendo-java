package Modulo_2;
import java.util.Scanner;

public class Programa_de_leitura_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome, cidade, estado, pais;
		int idade;
		float peso;
		
		System.out.print("digite seu nome: ");
		nome = scan.nextLine();
		
		System.out.print("digite sua idade: ");
		idade = scan.nextInt();
		
		System.out.print("digite sua cidade: ");
		cidade = scan.next();
		
		System.out.print("digite seu estado: ");
		estado = scan.next();
		
		System.out.print("digite seu Pais: ");
		pais = scan.next();
		
		System.out.print("digite seu peso: ");
		peso = scan.nextFloat();		
		
		System.out.println("resultados");
		System.out.println("nome: "+nome);
		System.out.println("idade: "+idade);
		System.out.println("cidade: "+cidade);
		System.out.println("estado: "+estado);
		System.out.println("pais: "+pais);
		System.out.println("peso:" +peso);
	}

}
