package demos;

import java.util.Scanner;

public class Caller{

	private static Scanner texto;

	public static void main(String[] args) {
		/* My first Selenium project.
		 * Very simple, it returns a website after a user input on execution.
		 * 
		 */
		String webSite;
		Runner executar = new Runner();
		texto = new Scanner(System.in);
		
		
		System.out.println("What web site you wanna go?");
		webSite = texto.nextLine();
		
		System.out.println("Target webesite: " + webSite);
		executar.invoke();
		executar.accessWebSite("http://www." + webSite); //using just example.com does not retrieve the website.
		
		
	}
}
