package circuitos;

public class Lampada {
	
	
	private boolean ligado; //Atributo que informa se a lâmpada está ligada.
	
	 
	public Lampada(boolean ligado){ //Ao construir a lâmpada, é informado o estado dela.
		this.ligado = ligado;
	}
	
	
	public void ligar(){ //Método que liga a lâmpada
		ligado = true;
	}
	
	
	public void desligar(){ //Método que desliga a lâmpada
		ligado = false;
	}
	
	
	public void imprimir(){ //Método que apresenta se a lâmpada está ligada ou não.
		
		if (ligado){
			System.out.println("Lâmpada Ligada");
		}
		else{
			System.out.println("Lâmpada Desligada");
		}
	}
}
