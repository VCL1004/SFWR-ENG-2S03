package se2s03;

import static org.junit.Assert.*;

import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Stackc1Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		
		  Stackc1 gps1=new Stackc1();
		  gps1.push('H');
		  gps1.push('W');
		  gps1.push('E');
		  
		  assertEquals('E',gps1.top());
		  
		  PrintStream ps1 = new PrintStream(System.out);
		  gps1.show(ps1);
		
		  gps1.pop();
		
		  assertEquals('W',gps1.top());
		  
		  assertEquals(false,gps1.isEmpty());
		  
		  gps1.pop();
		  
		  gps1.pop();
		  assertEquals(true,gps1.isEmpty());
		
	}

}
