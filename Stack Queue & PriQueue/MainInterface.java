package se2s03;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class MainInterface {


	public static void main(String args[])
 {System.out.println("main functions is exe");
		
  //Part 1:
  System.out.println("\n**********1 is start*************\n");
 Stackc1 gps1=new Stackc1();
 gps1.push('H');
 gps1.push('W');
 gps1.push('E');
 
 PrintStream ps1 = new PrintStream(System.out);
 gps1.show(ps1);
 
 System.out.println(gps1.top());  
 gps1.pop();
 System.out.println(gps1.top());  
 gps1.pop();
 System.out.println(gps1.top());  
 //gps1.pop();
 
 if(gps1.isEmpty())
	 System.out.println("Empty");	 
 else
	 System.out.println("Not Empty");
 
 

 
  
  
 //Part 2:
 
 System.out.println("\n**********2 is start*************\n");
 Stackc2 gps2=new Stackc2();
 gps2.push('H');
 gps2.push('W');
 gps2.push('E');
 gps2.push('E');
 
 PrintStream ps2 = new PrintStream(System.out);
 gps2.show(ps2);

 
 System.out.println(gps2.top());  
 gps2.pop();
 System.out.println(gps2.top());  
 gps2.pop();
 //System.out.println(gps2.top());  
 //gps2.pop();
 
 if(gps2.isEmpty())
	 System.out.println("Empty");	 
 else
	 System.out.println("Not Empty");
	

 //Part 3:
 
 System.out.println("\n**********3 is start*************\n");
 
 Queue3 gps3=new Queue3();
  gps3.enqueue('H');
  gps3.enqueue('W');
  gps3.enqueue('E');
  gps3.enqueue('F'); 
  
  
  PrintStream ps3 = new PrintStream(System.out);
  gps3.show(ps3);
  
  System.out.println(gps3.peek());
  
  gps3.dequeue();
  System.out.println(gps3.peek());
  
  gps3.dequeue();
  System.out.println(gps3.peek()); 
  
  gps3.dequeue();
  System.out.println(gps3.peek()); 
  
  gps3.dequeue();
  System.out.println(gps3.peek()); 
  
  if(gps3.isEmpty())
		 System.out.println("Empty");	 
	 else
		 System.out.println("Not Empty");
 
  gps3.dequeue();
  if(gps3.isEmpty())
		 System.out.println("Empty");	 
	 else
		 System.out.println("Not Empty");
 //delete from a empty queue, will do nothing
  gps3.dequeue();
  
  //Part 4:
System.out.println("\n**********4 is start*************\n");

 PriQueue4 gps4=new  PriQueue4();
 gps4.insertItem(8, 'c');
 gps4.insertItem(6, 'f');
 gps4.insertItem(7, 'g');
 gps4.insertItem(9, 'u');
 gps4.insertItem(10, 'c');
 
 
 PrintStream ps4 = new PrintStream(System.out);
 gps4.show(ps4);
 
 
 System.out.println(gps4.next());
 
 
 gps4.deleteItem();
 System.out.println(gps4.next());
 
 gps4.deleteItem();
 System.out.println(gps4.next());
 
 gps4.deleteItem();
 System.out.println(gps4.next());
 
 gps4.deleteItem();
 System.out.println(gps4.next());
 
 if(gps4.isEmpty())
		 System.out.println("Empty");	 
	 else
		 System.out.println("Not Empty");

 gps4.deleteItem();
 if(gps4.isEmpty())
		 System.out.println("Empty");	 
	 else
		 System.out.println("Not Empty");

 }
}

interface Stack 
{
public char top ( ) ;
public void pop ( ) ;
public void push (char a) ;
public boolean isEmpty ( ) ;
public void show( PrintStream p ) ;
}



interface Queue{
public char peek ( ) ; // f r o n t
public void dequeue ( ) ; // f r o n t
public void enqueue ( char c ) ; // back
public boolean isEmpty ( ) ;
public void show(PrintStream p ) ;
}


interface PriQueue{
public char next ( ) ; // h i g h e s t p r i o r i t y
public void deleteItem ( ) ; // h i g h e s t p r i o r i t y
public void insertItem ( int p, char a) ; // i n t p r i o r i t y , then a l p h a b e t i c a l
public boolean isEmpty ( ) ;
public void show( PrintStream p );

}


