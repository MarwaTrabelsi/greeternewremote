package edu.esprit.fibonacci;

public class Fibonacci {
 
 	public String var;
	//Hello this is the new added code after the push 
	//now we will see if github will detect the difference 
	public String sayHello(String nom){
		if (nom.equals("Man"))
			throw new IllegalArgumentException();
		else
		return "Hello "+nom;
	}
	
	
}
