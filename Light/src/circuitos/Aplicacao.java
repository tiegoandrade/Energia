package circuitos;

public class Aplicacao {
	
	public static void main(String[] args) {
		// Criando um objeto da classe L�mpada
		Lampada l = new Lampada(true);
		
		// Apresenta a situa��o atual da L�mpada
		l.imprimir();
		
		// Desliga a l�mpada e apresenta a situa��o atual L�mpada
		l.desligar();
		l.imprimir();
		
		// Liga a l�mpada e apresenta a situa��o atual L�mpada
		l.ligar();
		l.imprimir();

	}
}
