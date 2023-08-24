package classes;
//Anotacoes:
//Alteracoes de Gabryell leal:	1) edicao em listar(): adicionei um if/else para tratar a listagem dependendo 
//								   de quantos itens existem na lista.
//								2) tratamento de erros do menu: Para evitar que o codigo quebre em diferentes situacoes, criei um Try/catch onde: Se o usuario digitar algo invalido, 
//								   uma mensagem de erro sera exibida. O try deixa o codigo rolar ate que um erro de digitacao ou utilizacao de caracteres que nao queremos seja utilizadas. 
//								   dai entra o tratamento do processo com o SWITCH.
import java.util.InputMismatchException;
import java.util.Scanner;



public class comercio {

private itens produtos;
{
	Scanner t = new Scanner(System.in);
	int esc = 0;
	while (esc != 6) 
	{
		menu(); //mostra o menu
		try{	//percorre a escolha do usuario no menu
			esc = t.nextInt();
			t.nextLine();
			processEsc(esc);
		}
		catch (InputMismatchException e) { //Se o usuario escolher algo invalido, vai ser tratado da seguinte maneira:
			System.out.println("ERROR 003: //////Opção inválida. Por favor, insira um número válido.//////");
			t.nextLine(); // Limpa o buffer após o erro
		}
		
	}
	System.out.println("Encerrando o programa.");
	t.close(); //Retornara ao inicio do while
}
	public static void menu() {

		System.out.println("Seja bem-vindo à nossa concessionária.\nFaça sua escolha:\n"
				+ "1) Listar carros cadastrados.\n"
				+ "2) Cadastrar novo carro.\n"
				+ "3) Adicionar estoque a um carro existente.\n"
				+ "4) Remover um produto do comércio.\n"
				+ "5) Vender algum produto existente.\n"
				+ "6) Sair");
		
	}
	

	//!!!O tratamento de erros do menu so ocorre se existir esse metodo abaixo!!!
	private void processEsc(int esc) //metodo para tratar as opcoes escolhidas no menu
	{
		switch (esc) {
            case 1:
                listar();
                break;
            case 2:
				cadastrar();
                break;
            case 3:
				adicionar();
                break;
            case 4:
				remover();
                break;
			case 5:
				vender();
				break;
            case 6:
                System.out.println("Você escolheu sair.\nSaindo...");
                break;
            default:
                System.out.println("Opção inválida. Por favor, escolha uma opção de 1 a 5.");
		}
	}

	public boolean codigoExiste(long cod) {
		item selecionado = new item(null);
		for (item item : produtos.getProdutos()) {
			if (item.getCodigo() == cod) {
				selecionado = new item(item);
			}
		}
		boolean verdade = selecionado != null ? true:false;
		return verdade;
	}
	public void listar() {
		if(produtos.getProdutos().size() == 0){
			System.out.println("ERROR001: -------Nenhum produto cadastrado-------");
		}
		else
		{
		produtos.getProdutos().size();
		}
	}
	public void adicionar() {
		
	}
	public void remover() {
		
	}
	public void cadastrar() {
		
	}
	public void vender() {

	}
}

