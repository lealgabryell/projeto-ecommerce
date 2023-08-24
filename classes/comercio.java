package classes;

import java.util.Scanner;

public class Comercio {
	private Itens produtos;
	
	public void menu() {
		System.out.println("Seja bem-vindo à nossa concessionária.\nFaça sua escolha:\n"
				+ "1) Listar carros cadastrados.\n"
				+ "2) Cadastrar novo carro.\n"
				+ "3) Adicionar estoque a um carro existente.\n"
				+ "4) Remover um produto do comércio.\n"
				+ "5) Vender algum produto existente.\n"
				+ "6) Sair");
		Scanner t = new Scanner(System.in);
		int esc = Integer.parseInt(t.nextLine());
		if (esc == 2) {
			cadastrar();
		}
	}
	public boolean codigoExiste(long cod) {
		Item selecionado = new Item(null);
		for (Item item : produtos.getProdutos()) {
			if (item.getCodigo() == cod) {
				selecionado = new Item(item);
			}
		}
		boolean verdade = selecionado != null ? true:false;
		return verdade;
	}
	public void listar() {
		produtos.getProdutos().size();
	}
	public void adicionar() {
		
	}
	public void remover() {
		
	}
	public void cadastrar() {
		
	}
}
