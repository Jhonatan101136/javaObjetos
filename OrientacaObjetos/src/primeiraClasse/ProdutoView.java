package primeiraClasse;

public class ProdutoView {

	public static void main(String[] args) {
		
		Produto produto = new Produto();
		produto.nome = "Smartphone";
		produto.quantidadeEtoque = 8;
		
		exibirQuantidadeEmEstoque(produto);
		
		System.out.println("Necessario repor estoque do produto: " + produto.nome + "?" + validaEstoqueMinimo(produto));
		
		
	}
	
	
	static void exibirQuantidadeEmEstoque(Produto produto) {
		System.out.println("Quantidade em estoque do produto: " +produto.nome + " é " + produto.quantidadeEtoque + " unidades");
		
	}
	
	static Boolean validaEstoqueMinimo(Produto produto) {
		if(produto.quantidadeEtoque < Produto.quantidadeMinima) {
			return true;
		}
		return false;
		
	}

}
