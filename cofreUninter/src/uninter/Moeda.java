package uninter;

public abstract class Moeda { //Criação da classe abstrata.
	
	protected double valor; //protected para as classes filhas terem acesso.
	
	public abstract void info(); //Criação do método void.
	public abstract double converter(); //Criação do método para converter.

}
