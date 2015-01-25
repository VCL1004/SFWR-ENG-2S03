package se2s03;

import static org.junit.Assert.*;

import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PriQueue4Test {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		System.out.println("\n**********4 is start*************\n");

		 PriQueue4 gps4=new  PriQueue4();
		 gps4.insertItem(8, 'c');
		 gps4.insertItem(6, 'f');
		 gps4.insertItem(7, 'g');
		 gps4.insertItem(9, 'u');
		 gps4.insertItem(10, 'c');
		 
		 
		 PrintStream ps4 = new PrintStream(System.out);
		 gps4.show(ps4);
		 
		 
		 assertEquals('f',gps4.next());
		 
		 gps4.deleteItem();
		 assertEquals('g',gps4.next());
		 
		 gps4.deleteItem();
		 assertEquals('c',gps4.next());
		 
		 gps4.deleteItem();
		 assertEquals('u',gps4.next());
		 
		 gps4.deleteItem();
		 assertEquals('c',gps4.next());
		 
		 
		 assertEquals(false,gps4.isEmpty());
		 		 
		

		 gps4.deleteItem();
		 assertEquals(true,gps4.isEmpty());

		 
	}

}
