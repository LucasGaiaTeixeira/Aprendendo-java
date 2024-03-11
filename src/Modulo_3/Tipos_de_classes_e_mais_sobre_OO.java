package Modulo_3;

public class Tipos_de_classes_e_mais_sobre_OO  extends Teste_abstract{
	public static void main(String [] args) {
		
		new Tipos_de_classes_e_mais_sobre_OO().instanceMain2();
		Tipos_de_classes_e_mais_sobre_OO classe = new Tipos_de_classes_e_mais_sobre_OO();
		classe.iniciarJogo();
		classe.chamarMetodoAbstrato();
	
	}

	public void chamarMetodoAbstrato() {
		this.iniciarJogo(); //posso chamar usando o this, pois a classe pai Teste_abstract esta extendendo seus metodos e atributos para a classe filha Tipos_de_classe.....
		//iniciarJogo();
		this.start();
	}
	
	public void instanceMain2() {
		new Main2().print1();
	}
	
	private class Main2{
		public void print1() {
			System.out.println("chamando classe 2");
		}
	}

	public void start() {
		System.out.println("testando!!!!");
	}
	
	
}
