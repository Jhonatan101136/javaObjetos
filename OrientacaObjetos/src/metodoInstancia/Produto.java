package metodoInstancia;

public class Produto {
	
	String nome;
	
	Integer quantidadeEtoque;
	
	static final Integer quantidadeMinima = 10;
	
	 void exibirQuantidadeEmEstoque(Produto produto) {
		System.out.println("Quantidade em estoque do produto: " +produto.nome + " é " + produto.quantidadeEtoque + " unidades");
		
	}
	
	 Boolean validaEstoqueMinimo(Produto produto) {
		if(produto.quantidadeEtoque < Produto.quantidadeMinima) {
			return true;
		}
		return false;
		
	}

}
