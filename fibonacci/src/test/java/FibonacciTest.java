

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import edu.esprit.fibonacci.Fibonacci;


public class FibonacciTest {
Fibonacci f;
@Before
public void setUp(){
	f= new Fibonacci();
}
	@Test
	public void itShouldSayHelloWorld(){
		
		String result= f.sayHello("Word");
		Assert.assertEquals("Hello Word", result);
	}
	@Test(expected=IllegalArgumentException.class)
	public void itShouldRaiseException(){
		String param="Man";
		f.sayHello(param);
	}
	
	@After
	public void testDown(){
		f=null;
	}
}
