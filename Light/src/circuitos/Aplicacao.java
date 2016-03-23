package circuitos;

public class Aplicacao {
	
	public static void main(String[] args) {
		// Criando um objeto da classe Lâmpada
		Lampada l = new Lampada(true);
		
		// Apresenta a situação atual da Lâmpada
		l.imprimir();
		
		// Desliga a lâmpada e apresenta a situação atual Lâmpada
		l.desligar();
		l.imprimir();
		
		// Liga a lâmpada e apresenta a situação atual Lâmpada
		l.ligar();
		l.imprimir();

	}
}
