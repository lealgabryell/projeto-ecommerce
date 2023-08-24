package classes;

import java.util.ArrayList;

public class Itens{
	ArrayList<Item> produtos = new ArrayList<Item>();
	
//	public boolean codigoExiste(long cod) {
//		boolean verdade = false;
//		for (Item item : produtos) {
//			if (item.getCodigo() == cod) {
//				verdade = true;
//			}
//		}
//		return verdade;
//	}
	public int codigoExiste(long cod) {
		int verdade = 0;
		for (Item item : produtos) {
			if ((long)item.getCodigo() == (long) cod) {
				verdade += 1;
			}
		}
		return verdade;
	}
	
	public Item findCod(long cod) {
		Item selecionado = null;
		for (Item item : produtos) {
			if (item.getCodigo() == cod) {
				selecionado = item;
			}
		}
		return selecionado;
	}
	public void listar() {
		for (int i = 0; i < produtos.size();i++) {
			System.out.printf("%d) %12s (cód.: %10d | estoque: %4d)\n",
					i+1,
					produtos.get(i).getNome(),
					produtos.get(i).getCodigo(),
					produtos.get(i).getEstoque());
		}
	}
	
	public void cadastrar(Item i) {
		produtos.add(i);
		System.out.printf("%s cadastrado com sucesso!\n", i.getNome());
	}
	
	public void adicionar(long cod, int adiciona) {
		if (codigoExiste(cod) > 0) {
			Item selecionado = findCod(cod);
			selecionado.addEstoque(adiciona);
			System.out.printf("Estoque do %s foi adicionado com sucesso!\n", selecionado.getNome());
		}else {
			System.out.println("O código não existe!");
		}
		
	}
	public void remover(long cod) {
		if (codigoExiste(cod) > 0) {
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
