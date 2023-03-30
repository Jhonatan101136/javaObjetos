package encapsulamento;

public class Pedido {
	
    Double subTotal;
	
	Double desconto;
	
	//Double total;
	
	String codigo;
	
	String nome;
	
	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	String getCodigo() {
		return codigo;
	}

	void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	Double getSubTotal() {
		return subTotal;
	}

	void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	Double getDesconto() {
		return desconto;
	}

	void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
 
	Double getTotal() {
	return subTotal - desconto;
	}

	void setTotal(Double total) {
		
	}
	

	
	
	

}
