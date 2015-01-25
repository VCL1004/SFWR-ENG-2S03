package se2s03;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

//Part 2:
//a class stack of characters
public class Stackc2 implements Stack {
	
	private List<ListNc2> c =new ArrayList<ListNc2>();;
	private int i=-1;
	Stackc2() {};
	Stackc2(final List<ListNc2> l) {i++; c.add( (ListNc2) l); }
	public boolean isEmpty() { return i == -1; }
	public void push(char a) {i++; c.add(new ListNc2(a));}
	public void pop() {if(i>=0) c.remove(i--); }
	public char top() {
  try
  {return c.get(i).hd; }
	catch(Exception e)
  {
	System.out.println("Error,the stack is empty");
	}
  return ' ';
	}
	 public void show( PrintStream p ) 
	  {
		
	      p.print("\nthe data structure display starts here\n");
	     
		 int ishow=i; 
		  while(ishow>=0)
		  {
		  p.print(c.get(ishow).hd);
		  ishow--;
		  p.print("\n");	  		  
		  }  
		  p.print("the data structure display ends here\n");
		  //p.close();
	 }
  }


