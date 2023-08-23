package classes;

import java.util.ArrayList;

public class Itens {
	ArrayList<Item> produtos = new ArrayList<Item>();
	
	public boolean codigoExiste(long cod) {
		Item selecionado = new Item(null);
		for (Item item : produtos) {
			if (item.getCodigo() == cod) {
				selecionado = new Item(item);
			}
		}
		boolean verdade = selecionado != null ? true:false;
		return verdade;
	}
	
	public Item findCod(long cod) {
		Item selecionado = new Item(null);
		for (Item item : produtos) {
			if (item.getCodigo() == cod) {
				selecionado = new Item(item);
			}
		}
		return selecionado;
	}
	public void listar() {
		for (Item item : produtos) {
			System.out.printf("%s (%l | %d)",item.getNome(),item.getCodigo(),item.getEstoque());
		}
	}
	
	public void cadastrar(Item i) {
		produtos.add(i);
		System.out.printf("%s cadastrado com sucesso!", i.getNome());
	}
	public void adicionar(long cod, int adiciona) {
		if (codigoExiste(cod) == true) {
			Item selecionado = findCod(cod);
			selecionado.addEstoque(adiciona);
			System.out.printf("Estoque do %s foi adicionado com sucesso!", selecionado.getNome());
		}else {
			System.out.println("O código não existe!");
		}
		
	}
	public void remover(long cod) {
		if (codigoExiste(cod) == true) {
			Item selecionado = findCod(cod);
			produtos.remove(selecionado);
		}else {
			System.out.println("O código não existe!");
		}
	}

	public ArrayList<Item> getProdutos() {
		return produtos;
	}


	
}
