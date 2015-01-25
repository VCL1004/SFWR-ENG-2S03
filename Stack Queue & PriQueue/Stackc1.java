package se2s03;

import java.io.PrintStream;

//Part 1:
//a class stack of characters
public class Stackc1 implements Stack {
	  private ListNc c;
	  Stackc1() { this.c = null; }
	  Stackc1(final ListNc l) { this.c = l; }
	  public boolean isEmpty() { return c == null; }
	  public void push(final char a) { c = new ListNc(a, c); }
	  public void pop() { c = c.tl; }
	  public char top() {
	   try{
			  return c.hd; 
		  }
	  catch(Exception e)
	    {
		System.out.println("Error,the stack is empty");
		}
		  return ' ';
	  }
	  
	  public void show( PrintStream p ) 
	  {
		
	      p.print("\nthe data structure display starts here\n");
		  ListNc cshow=this.c;
		  
		  while(cshow!=null)
		  {
		  p.print(cshow.hd);
		  p.print("\n");
		  cshow=cshow.tl;
		  
		  }  
		  p.print("the data structure display ends here\n");
		  //p.close();
	 }
	}



