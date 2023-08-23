package classes;

public class Comercio {
	private Itens produtos;
	
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
		produtos.adicionar(23399, 0);
	}
	public void remover() {
		
	}
	
}
