package uninter;

public class Euro extends Moeda {
	
	//Declaração de atributos.
	
	public Euro(double valorInicial) { //Método construtor para a moeda Euro.
		
		this.valor = valorInicial;
	}

	@Override //Irá sobreescrever no método info().
	public void info() {
		
		System.out.println("Euro: " + valor);
		
	}

	@Override //Irá sobreescrever no método converter.
	public double converter() { //Método para converter.
		
		return this.valor * 5.4;
	}
	
	@Override //Irá sobreescrever no método remover.
	public boolean equals (Object objeto) {
		
		if(this.getClass() != objeto.getClass()) {
			
			return false;
		}
		
		Euro objetoDeEuro = (Euro) objeto;
		
		
		if (this.valor != objetoDeEuro.valor) {
			
			return false;
		}
		
		return true;
	}

}
