package se2s03;

import java.io.PrintStream;

//Part 4:

public class PriQueue4 implements PriQueue{
private PListN c,ctemp,cfread;

PriQueue4() { this.c = null; }
PriQueue4(final PListN l) { this.c = l; }
public char next ()// h i g h e s t p r i o r i t y
{
 try
 {
 return c.hd;
 }
 catch(Exception e)
    {
	System.out.println("Error,the priorityQueue is empty");
	}	
 return ' ';
}
public void deleteItem ( )  // h i g h e s t p r i o r i t y
{   if(c!=null)
 this.c=c.tl;
}
public void insertItem ( int p, char a)  // i n t p r i o r i t y , then a l p h a b e t i c a l
{
 ctemp=c;
 cfread=null;

 if(ctemp==null)//empty
 { 
	 //System.out.println("empty stack");
	 c= new PListN(p, a,null);
 }
 
 else
 {
	 while(true)
	 {
		 if((ctemp.pri<p ||(ctemp.pri==p && ctemp.hd<a)) )
	     {
		
		cfread=ctemp;
	     
	     if(ctemp.tl!=null)  
	     ctemp=ctemp.tl;
	     else
	     {
	  //  System.out.println("to tail");
	    ctemp.tl=new PListN(p, a,null);
	    break;
	     }
	     
	     }				 
		 else
		 { 
			 if(cfread==null)
			 {
			 	 c=new PListN(p, a,ctemp);
		//	 	System.out.println("insert to head");
			 }
			 else
			 {
				 cfread.tl=new PListN(p, a,ctemp);
		//		 System.out.println("insert to middle");
			 }
		
				 break;
		 
		 
		 }		 
	 }
 

 
 }

}

public boolean isEmpty() { return c == null; }
public void show( PrintStream p ) 
{
 p.print("\nthe data structure display starts here\n");
 PListN cshow=this.c;
  
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

