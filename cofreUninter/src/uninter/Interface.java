package uninter;

import java.util.Scanner;

public class Interface {
	
	
	private Scanner teclado;
	private Cofrinho cofrinho;
	
	public Interface() { //Construtor.
		
		teclado = new Scanner(System.in); // Irá receber a entrada do usuário.
		cofrinho = new Cofrinho();
		
	}
	
	public void menu() { //Método para exibir o menu principal.
		
		System.out.println("------------------------------------");
		System.out.println("| C O F R I N H O    U N I N T E R |");
		System.out.println("------------------------------------");
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("|       Seja bem vindo(a)!         |");
		System.out.println("|   Digite uma das opções abaixo:   |");
		System.out.println("------------------------------------");
		System.out.println();
		System.out.println("1 - Adicionar moedas");
		System.out.println("2 - Remover moedas");
		System.out.println("3 - Listar moedas");
		System.out.println("4 - Calcular total de moedas convertido para Real");
		System.out.println("0 - Encerrar\n");
		
		int opcao = teclado.nextInt(); 
		
		switch (opcao) { // Estrutura para testar condições.
		
			case 0:
				
				System.out.println("Encerrando...");
				break;
				
			case 1:
				
				subInterfaceAdicionarMoedas();
				
				menu();
				
				break;
				
			case 2:
				
				subInterfaceRemoverMoedas();
				
				menu();
				
				break;
				
			case 3:
				
				cofrinho.listagemMoedas();
				menu();
				
				break;
				
			case 4:
				double valorTotalConvertido = cofrinho.totalConvertido();
				String valorTotalConvertidoTxt = String.format("%.2f", valorTotalConvertido); //Irá formatar a String e deixar com 2 casas decimais.
				valorTotalConvertidoTxt = valorTotalConvertidoTxt.replace(".", ",");
				System.out.println("O valor total das moedas convertido para Real é R$: " + valorTotalConvertidoTxt);
				menu();
				break;
				
			default:
				System.out.println("\nOpção Inválida!\nTente novamente.");
				menu();
				break;
		}
	}
	
	private void subInterfaceAdicionarMoedas() { // Método para exibir o menu de adicionar moedas dentro do case 1.
		
		System.out.println("\nEscolha o tipo de moeda: \n");
		System.out.println("1 - Real ");
		System.out.println("2 - Dólar ");
		System.out.println("3 - Euro \n");
		
		int opcaoMoeda = teclado.nextInt(); //Irá guardar a opção de moeda desejada pelo usuário.
		
		System.out.println("\nQuanto você deseja guardar no cofrinho?: ");
		
		String valorTxtMoeda = teclado.next(); //Irá guardar a quantidade que o usuário guardou no cofrinho.
		
		valorTxtMoeda = valorTxtMoeda.replace(",", "."); //Irá trocar a vírgula pelo ponto.
		
		double valorMoeda = Double.parseDouble(valorTxtMoeda); //Irá converter e salvar o valor da moeda digitado pelo usuário.
		
		Moeda moeda = null; //Irá iniciar a variável vazia para ser incrementada posteriormente.
		
		//Condicionais de cada tipo de moeda para serem incrementadas.
		
		if (opcaoMoeda == 1) {
			
			moeda = new Real(valorMoeda);
			
		}
		
		else if (opcaoMoeda == 2) {
			
			moeda = new Dolar(valorMoeda);
			
		}
		
		else if (opcaoMoeda == 3) {
			
			moeda = new Euro(valorMoeda);
			
		}
		
		
		cofrinho.adicionar(moeda); //Irá adicionar as moedas do usuário no cofrinho.
		
		System.out.println("\nQuantia adicionada com sucesso!\n");
	}
	
	private void subInterfaceRemoverMoedas() { // Método para exibir o menu de remover as moedas dentro do case 2.
		
		System.out.println("\nEscolha o tipo de moeda: \n");
		System.out.println("1 - Real ");
		System.out.println("2 - Dólar ");
		System.out.println("3 - Euro \n");
		
		int opcaoMoeda = teclado.nextInt();
		
		System.out.println("\nDigite a quantia: ");
		
		String valorTxtMoeda = teclado.next();
		
		valorTxtMoeda = valorTxtMoeda.replace(",", ".");
		
		double valorMoeda = Double.parseDouble(valorTxtMoeda); //Irá converter e salvar o valor da moeda digitado pelo usuário.
		
		Moeda moeda = null; //Irá iniciar a variável vazia para ser incrementada posteriormente.
		
		//Condicionais de cada tipo de moeda para serem incrementadas e posteriormente removidas.
		
		if (opcaoMoeda == 1) {
			
			moeda = new Real(valorMoeda);
			
		}
		
		else if (opcaoMoeda == 2) {
			
			moeda = new Dolar(valorMoeda);
			
		}
		
		else if (opcaoMoeda == 3) {
			
			moeda = new Euro(valorMoeda);
			
		}
		
		
		cofrinho.remover(moeda); //Irá remover as moedas do cofrinho.
		
	}

}
