package uninter;

import java.util.ArrayList;

public class Cofrinho {
	
	//Declaração do atributo ArrayList.
	
	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() { //Método construtor para o cofrinho.
		
		this.listaMoedas = new ArrayList<>();
	}
	
	public void adicionar (Moeda moeda) { //Método construtor para adicionar as moedas.
		
		this.listaMoedas.add(moeda);
	}
	
	public void remover (Moeda moeda) { //Método construtor remover as moedas.
		
		this.listaMoedas.remove(moeda);
	}
	
	public void listagemMoedas() { //Método construtor para listar as moedas.
		
		if (this.listaMoedas.isEmpty()) {
			
			System.out.println("\nPoxa, seu cofrinho está vazio :/!\nAdicione moedas.\n");
			return;
		}
		
		for (Moeda moeda : this.listaMoedas) {
			moeda.info();
		}
	}

	public double totalConvertido() { //Método construtor para converter as moedas.
		
		if (this.listaMoedas.isEmpty()) {
			
			return 0;
		}
		
		double valorAcumulado = 0;
		
		for (Moeda moeda : this.listaMoedas) {
			valorAcumulado = valorAcumulado + moeda.converter();
		}
		
		return valorAcumulado;
	}

}
