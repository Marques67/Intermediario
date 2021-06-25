package application;

import model.entities.Client;

public class Program_Client {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "test";
		String s2 = "test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		System.out.println(c1 == c2); //o == d� falso pois ele verifica o "espa�o na mem�ria". Como eles ocuparam espa�os diferentes, deu falso.
		System.out.println(s1 == s2);
	}

}
