package encapsulamento;

public class Encapsulamento {

	public static void main(String[] args) {
		
//		Cliente cliente  = new Cliente();
//		
//		cliente.nome = "Jhonatan Westerhofen";
//		cliente.telefone =  "54888888";
//		
//		System.out.println("Nome cliente " + cliente.nome);
		
		Cliente cliente  = new Cliente();
		
		cliente.setNome("Jhonatan Westerhofen");
		cliente.setTelefone("34225225");
		
		System.out.println("Nome cliente: " + cliente.getNome());
		System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
		System.out.println("Primeiro nome: " + cliente.getUltimoNome());

	}

}
