// Classe de objetos do PRODUTO

public class Produto{ 

	// Atributos de PRODUTO
	private int id; 
	private String nome;
	private String descricao;
	private int quantidade;
	private double precoCusto;
	private double lucro;
	private double precoVenda;
	
	// Propriedades Get e Set
	
	// Set == Armazena valor no objeto
	public void setId(int id) {this.id = id;}
	// Get == Retorna o valor armazenado
	public int getId() {return this.id;}

	public void setNome(String nome) {this.nome = nome;}
	public String getNome(){return this.nome;}

	public void setDescricao(String descricao) {this.descricao = descricao;}
	public String getDescricao() {return this.descricao;}

	public void setQuantidade(int quantidade){this.quantidade = quantidade;}
	public int getQuantidade(){return this.quantidade;}

	public void setPrecoCusto(double precoCusto){this.precoCusto = precoCusto;}
	public double getPrecoCusto(){return this.precoCusto;}

	public void setLucro(double lucro){this.lucro = lucro;}
	public double getLucro(){return this.lucro;}

	public void setPrecoVenda(double precoVenda){this.precoVenda =precoVenda;}
	public double getPrecoVenda(){return this.precoVenda;}

}



