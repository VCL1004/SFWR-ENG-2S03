package se2s03;

import java.io.PrintStream;

//Part 3:
public class Queue3 implements Queue{
	private SnocListN h,t ;
	Queue3(){this.h=null;this.t=null;};
	Queue3(final SnocListN l){this.h=l;this.t=l;};
	
	public char peek () // f r o n t
	{	try
	     {
		return this.h.c;
	     }
	catch(Exception e)
	    {
		System.out.println("Error,the queue is empty");
		}
	return ' ';
	}
	
	public void dequeue ( ) // f r o n t
	{	if(h!=null)	
		h=h.l;		
	}
	
	public void enqueue ( char c )  // back
	{
		if(h==null)//the queue is empty
		{h=new SnocListN(c,null);
		 t=h;
		}
		else
		{
		t.l=new SnocListN(c,null);
		t=t.l;}
		
	}
	public boolean isEmpty (){return h==null;} ;
	
	
	public void show( PrintStream p ) 
	  {
		  p.print("\nthe data structure display starts here\n");
		  SnocListN hshow=this.h;
		  
		  while(hshow!=null)
		  {
		  p.print(hshow.c);
		  p.print("\n");
		  hshow=hshow.l;
		  
		  }  
		  p.print("the data structure display ends here\n");
		  //p.close();
	 }
	
}



