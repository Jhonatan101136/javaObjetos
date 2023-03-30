package metodoInstancia;


public class Principal {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.nome = "SOJA";
		produto.quantidadeEtoque = 9;
		
		System.out.println("Necessário repor o estoque" + produto.nome + " ? " + produto.validaEstoqueMinimo(produto) );
		
		
		

	}

}
