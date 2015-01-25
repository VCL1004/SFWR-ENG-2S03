package se2s03;

import static org.junit.Assert.*;

import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Queue3Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		 System.out.println("\n**********3 is start*************\n");
		 
		 Queue3 gps3=new Queue3();
		  gps3.enqueue('H');
		  gps3.enqueue('W');
		  gps3.enqueue('E');
		  gps3.enqueue('F'); 
		  PrintStream ps3 = new PrintStream(System.out);
		  gps3.show(ps3);
		  
		  assertEquals('H',gps3.peek());
		  gps3.dequeue();
		  assertEquals('W',gps3.peek());
		  gps3.dequeue();
		  gps3.dequeue();
		  
		  assertEquals(false,gps3.isEmpty());
		  
          gps3.dequeue();
		  
		  assertEquals(true,gps3.isEmpty());
		  
	}

}
