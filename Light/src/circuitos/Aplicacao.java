package circuitos;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Lampada l = new Lampada(true); //Criando uma lâmpada ligada.
		
		
		l.imprimir(); //Apresenta o estado atual da lâmpada.
		
		
		l.desligar(); //Desliga a lâmpada.
		
		l.imprimir(); //Apresenta o estado atual da lâmpada.
		
	
		l.ligar(); // Liga a lâmpada
		
		l.imprimir(); //Apresenta o estado atual da lâmpada.

	}
}
