package circuitos;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Lampada l = new Lampada(true); //Criando uma l�mpada ligada.
		
		
		l.imprimir(); //Apresenta o estado atual da l�mpada.
		
		
		l.desligar(); //Desliga a l�mpada.
		
		l.imprimir(); //Apresenta o estado atual da l�mpada.
		
	
		l.ligar(); // Liga a l�mpada
		
		l.imprimir(); //Apresenta o estado atual da l�mpada.

	}
}
