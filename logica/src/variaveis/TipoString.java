package variaveis;

public class TipoString {

	public static void main(String[] args) {
		
		String email = "maRx-Rossi@Hotmail.com";
		
		System.out.println("Original: " + email);
		System.out.println("Min�scula: " + email.toLowerCase());
		System.out.println("Mai�scula: " + email.toUpperCase());
		System.out.println("Tamanho: " + email.length());
		System.out.println("Terceiro Caracter: " + email.charAt(2));
		System.out.println("Tem arroba? " + email.contains("@"));
		System.out.println("Posi��o do @: " + email.indexOf("@"));
		System.out.println("Terceiro ao quinto caracter: " + email.substring(2, 5));
		System.out.println("Segunda metade do e-mail: " + email.substring(email.length()/2, email.length()));
		System.out.println("Servidor do email: " + email.substring(email.indexOf("@"), email.length()));
		System.out.println("Usu�rio do e-mail: " + email.substring(0, email.indexOf("@")));
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
