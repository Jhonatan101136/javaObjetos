package metodoInstancia;

public class Cliente {

	String primeiroNome;
	
	String ultimoNome;
	
	String telefone;
	
	String email;
	
	String ObterNomeCompleto() {
		String nomeCompleto = primeiroNome + " " + ultimoNome;
		
		return nomeCompleto;
	}
	
	String ObterDDD() {
		String ddd = telefone.substring(0,2);
		return ddd;
	}
}
