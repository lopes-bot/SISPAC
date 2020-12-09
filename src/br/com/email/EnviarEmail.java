package br.com.email;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

public class EnviarEmail {

	public static void main(String[] args) {
		String meuEmail = "javatestepatati@gmail.com";
		String minhaSenha = "patati01java#";
		String destino = "andrelopessfla@gmail.com";
		
		SimpleEmail email = new SimpleEmail();
		email.setHostName("smtp.gmail.com");
		email.setSmtpPort(465);
		email.setAuthenticator(new DefaultAuthenticator(meuEmail,minhaSenha));
		email.setSSLOnConnect(true);
		 try {
			 email.setFrom(meuEmail);
			 email.setSubject("teste");
			 email.setMsg("enviando email com java");
			 email.addTo(destino);
			 email.send();
			 System.out.println("Email enviado");
		 }catch(Exception e) {
			e.printStackTrace(); 
		 }

	}

}
