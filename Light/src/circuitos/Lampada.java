package circuitos;

public class Lampada {
	
	// Atributo de Lâmpada, armazena o estado atual da lâmpada.
	private boolean ligado; 
	
	 // Construtor que recebe como parâmetro o estado inicial da lâmpada.
	public Lampada(boolean ligado){
		this.ligado = ligado;
	}
	
	// Método que liga a lâmpada
	public void ligar(){
		ligado = true;
	}
	
	// Método que desliga a lâmpada
	public void desligar(){
		ligado = false;
	}
	
	//Método que apresenta se a lâmpada está ligada ou não.
	public void imprimir(){
		
		if (ligado){
			System.out.println("Lâmpada Ligada");
		}
		else{
			System.out.println("Lâmpada Desligada");
		}
	}
}
