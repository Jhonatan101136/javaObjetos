package EmailEnvio;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Carteiro {
	
	static void enviar(String para, String assunto, String msg) throws EmailException {
		
	String username = "jhonatandossantos.inter@outlook.com";
	String password = "Jhonawest%95";

	Email email = new SimpleEmail();
	email.setHostName("smtp.office365.com");
	email.setSmtpPort(587);
	email.setAuthenticator(new DefaultAuthenticator("jhonatan dos santos", "Jhonawest%95"));
	email.setFrom("jhonatandossantos.inter@gmail.com");
	email.setSubject(assunto);
	email.setMsg(msg);
	email.addTo(para);
	email.setStartTLSEnabled(true);
	email.send();

}

}
