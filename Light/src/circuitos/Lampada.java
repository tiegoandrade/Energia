package circuitos;

public class Lampada {
	
	// Atributo de L�mpada, armazena o estado atual da l�mpada.
	private boolean ligado; 
	
	 // Construtor que recebe como par�metro o estado inicial da l�mpada.
	public Lampada(boolean ligado){
		this.ligado = ligado;
	}
	
	// M�todo que liga a l�mpada
	public void ligar(){
		ligado = true;
	}
	
	// M�todo que desliga a l�mpada
	public void desligar(){
		ligado = false;
	}
	
	//M�todo que apresenta se a l�mpada est� ligada ou n�o.
	public void imprimir(){
		
		if (ligado){
			System.out.println("L�mpada Ligada");
		}
		else{
			System.out.println("L�mpada Desligada");
		}
	}
}
