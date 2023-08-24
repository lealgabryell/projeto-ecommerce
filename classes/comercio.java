package classes;
//Anotacoes:
//Alteracoes de Gabryell leal:	1) edicao em listar(): adicionei um if/else para tratar a listagem dependendo 
//								   de quantos itens existem na lista.
//								2) tratamento de erros do menu: Para evitar que o codigo quebre em diferentes situacoes, criei um Try/catch onde: Se o usuario digitar algo invalido, 
//								   uma mensagem de erro sera exibida. Ainda falta ajustes nesse tratamento. DO jeito que esta, o codigo vai parar assim que aparecer a mensagem, 
//								   preciso ver uma forma de fazer com que volte para a escolha do menu.
import java.util.InputMismatchException;
import java.util.Scanner;

public class comercio {
	private itens produtos;
	
	public void menu() {
		try
		{
		System.out.println("Seja bem-vindo à nossa concessionária.\nFaça sua escolha:\n"
				+ "1) Listar carros cadastrados.\n"
				+ "2) Cadastrar novo carro.\n"
				+ "3) Adicionar estoque a um carro existente.\n"
				+ "4) Remover um produto do comércio.\n"
				+ "5) Vender algum produto existente.\n"
				+ "6) Sair");
		Scanner t = new Scanner(System.in);
		int esc = Integer.parseInt(t.nextLine());
		if (esc == 1) {
			listar();
		}
		if (esc == 2) {
			cadastrar();
		}
	}
	catch(InputMismatchException e){
		System.out.println("ERROR002: -----------A escolha da opcao do menu deve ser numerica (ex.: 1, 2, 3, etc.).-----------");
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
}
