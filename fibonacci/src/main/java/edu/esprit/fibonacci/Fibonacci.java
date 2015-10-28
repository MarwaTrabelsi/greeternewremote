package edu.esprit.fibonacci;

public class Fibonacci {

	
	public String sayHello(String nom){
		if (nom.equals("Man"))
			throw new IllegalArgumentException();
		else
		return "Hello "+nom;
	}
	
	
}
