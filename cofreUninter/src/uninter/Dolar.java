package uninter;

public class Dolar extends Moeda {
	
	//Declaração de atributos.
	
	public Dolar(double valorInicial) { //Método construtor para a moeda Dólar.
		
		this.valor = valorInicial;
	}

	@Override //Irá sobreescrever o método info().
	public void info() {
		
		System.out.println("Dólar: " + valor);
		
	}

	@Override //Irá sobreescrever o método converter.
	public double converter() { //Método para converter.
		
		return this.valor * 4.8;
	}
	
	@Override //Irá sobreescrever no método remover.
	public boolean equals (Object objeto) {
		
		if(this.getClass() != objeto.getClass()) {
			
			return false;
		}
		
		Dolar objetoDeDolar = (Dolar) objeto;
		
		
		if (this.valor != objetoDeDolar.valor) {
			
			return false;
		}
		
		return true;
	}

}
