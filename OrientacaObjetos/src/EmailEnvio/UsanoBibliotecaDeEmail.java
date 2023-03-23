package EmailEnvio;

import org.apache.commons.mail.EmailException;

public class UsanoBibliotecaDeEmail {

	public static void main(String[] args) throws EmailException {
		
	Carteiro.enviar("jhonatandossantos.inter@outlook.com", "Teste envio de email", "FUNCIONOOU");
	
	System.out.println("deu");

	}

}
