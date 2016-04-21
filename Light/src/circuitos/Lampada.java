package circuitos;

public class Lampada {
	
	
	private boolean ligado; //Atributo que informa se a l�mpada est� ligada.
	
	 
	public Lampada(boolean ligado){ //Ao construir a l�mpada, � informado o estado dela.
		this.ligado = ligado;
	}
	
	
	public void ligar(){ //M�todo que liga a l�mpada
		ligado = true;
	}
	
	
	public void desligar(){ //M�todo que desliga a l�mpada
		ligado = false;
	}
	
	
	public void imprimir(){ //M�todo que apresenta se a l�mpada est� ligada ou n�o.
		
		if (ligado){
			System.out.println("L�mpada Ligada");
		}
		else{
			System.out.println("L�mpada Desligada");
		}
	}
}
