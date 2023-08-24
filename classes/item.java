package classes;

public class item {
	private String nome;
	private long codigo;
	private int estoque;
	
	public item(String nome, long cod){
		this.setNome(nome);
		this.setCodigo(cod);
		this.setEstoque(0);
	}
	
	public item(item i) {
		this.setNome(i.getNome());
		this.setCodigo(i.getCodigo());
		this.setEstoque(i.getEstoque());
	}
	
	protected String getNome() {
		return nome;
	}
	protected void setNome(String nome) {
		this.nome = nome;
	}
	protected long getCodigo() {
		return codigo;
	}
	protected void setCodigo(long codigo) {
		this.codigo = codigo;
	}
	protected int getEstoque() {
		return estoque;
	}
	protected void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	
	protected void addEstoque(int n) {
		this.setEstoque(getEstoque() + n);
	}
	protected void venderEstoque(int n) {
		this.setEstoque(getEstoque() - n);
	}
}
