package Junittest;


//import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class SampleTest {
		
	@Test
	public void Helloと言っているか() {
		Product pr = new Product();
		assertEquals(pr.sayHello(), "Hello");
		
//		SampleTest hello = new SampleTest();
//		assertThat(pr.sayHello(), is("Hello"));
	}
}



