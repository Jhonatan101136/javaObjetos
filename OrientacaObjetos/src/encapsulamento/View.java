package encapsulamento;

public class View {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido();
		
//		pedido.nome = "SOJA EM GRAOS";
//		pedido.codigo = "52";
//		pedido.subTotal = 100.0;
//		pedido.desconto = 23.0;
//		pedido.total = 77.0;
		
		pedido.setCodigo("5");
		pedido.setNome("SOJA EM GRAOS");
		pedido.setSubTotal(100.0);
		pedido.setDesconto(23.0);
		pedido.setTotal(77.0);
		
		System.out.println(" O produto: " + pedido.getNome() + " Codigo" + pedido.getCodigo());
		System.out.println(" Tem um valor bruto de:  " + pedido.getSubTotal() + " Com um desconto de: " + pedido.getDesconto() + " Custa um total de :" + pedido.getTotal());
		

	}

}
