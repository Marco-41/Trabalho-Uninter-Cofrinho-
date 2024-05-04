package uninter;

public class Real extends Moeda {
	
	public Real(double valorInicial) { //Método construtor da moeda Real.
		
		this.valor = valorInicial;
	}

	@Override //Irá sobreescrever no método info().
	public void info() {
		System.out.println("Real: " + valor);
		
	}

	@Override //Irá sobreescrever no método converter.
	public double converter() { //Método para converter.
		return this.valor;
		
		
	}
	
	@Override //Irá sobreescrever no método remover.
	public boolean equals (Object objeto) {
		
		if(this.getClass() != objeto.getClass()) {
			
			return false;
		}
		
		Real objetoDeReal = (Real) objeto;
		
		
		if (this.valor != objetoDeReal.valor) {
			
			return false;
		}
		
		return true;
	}

}
