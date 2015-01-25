package se2s03;

import static org.junit.Assert.*;

import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Stackc2Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		 System.out.println("\n**********2 is start*************\n");
		 Stackc2 gps2=new Stackc2();
		 gps2.push('H');
		 gps2.push('W');
		 gps2.push('E');
		 gps2.push('E');
		 
		 PrintStream ps2 = new PrintStream(System.out);
		 gps2.show(ps2);
		 assertEquals('E',gps2.top());
		 
		 gps2.pop();
		 gps2.pop();
		 
		 assertEquals('W',gps2.top());
		 
		 gps2.pop();
		 
		 assertEquals('H',gps2.top());
		 assertEquals(false,gps2.isEmpty());
		 
		 gps2.pop();
		 assertEquals(true,gps2.isEmpty());
		 
		 
	}

}
