package metodoInstancia;

public class metodoInstancia {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		
		cliente.primeiroNome = "Jhonatan";
		cliente.ultimoNome = "Westerhofen";
		cliente.telefone = "45988244833";
		cliente.email = "jhonatandossantos.w@gmail.com";
		
		System.out.println("Nome cliente: " +cliente.ObterNomeCompleto() + ", DDD " + cliente.ObterDDD());

	}
}
