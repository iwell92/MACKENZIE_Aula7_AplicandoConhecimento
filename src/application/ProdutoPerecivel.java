package application;

public class ProdutoPerecivel extends Produto {

	protected int validade;
	
	ProdutoPerecivel(String nome, int quantidade, double preco, int validade) {
		super(nome, quantidade, preco);
		this.validade=validade;
	}
	
	public void retiraEstoque(int qtde) {
		if (quantidade <= qtde) {
			quantidade = 0;
		}
		else {
			quantidade -= qtde;
		}	
	}
	
	public void entraEstoque(int qtde) {
		if (quantidade == 0) {
			quantidade += qtde;
		}
		else {
			quantidade += qtde;
		}
	}
	
	public String toString() {
		return  "\n" + nome + "\n" + quantidade + "\nPreço" + "\n" + preco
				+ "\n" + validade;
	}

}
