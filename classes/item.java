package classes;

public class Item {
	private String nome;
	private long codigo;
	private int estoque;
	
	public Item(String nome, long cod, int estoque){
		this.setNome(nome);
		this.setCodigo(cod);
		this.setEstoque(estoque);
	}
	
	public Item(Item i) {
		this.setNome(i.getNome());
		this.setCodigo(i.getCodigo());
		this.setEstoque(i.getEstoque());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getCodigo() {
		return codigo;
	}
	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public void addEstoque(int n) {
		this.setEstoque(getEstoque());
	}
	
}
