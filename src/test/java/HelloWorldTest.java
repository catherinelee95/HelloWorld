import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HelloWorldTest {
	@Test
	public void testHelloWorld() {
		HelloWorld helloWorld = new HelloWorld();
		String result = helloWorld.getHellowWorld();
		assertEquals(result, "Hello World, some name");
	}
	
}
