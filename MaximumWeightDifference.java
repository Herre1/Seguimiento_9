
import java.util.*;
import java.lang.*;
import java.io.*;


class MaximumWeightDifference
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner lector=new Scanner(System.in);
	   
	   int t=lector.nextInt();
	   
	   int n,k;
	   int[] w;
	   int me;
	   int child;
	   int c;
	   int group;
	   int diff;
	   
	   while(t!=0) {
	     n=lector.nextInt();
	     k=lector.nextInt();
	     
	     w=new int[n];
	     for(int i=0;i<n;i++)
	       w[i]=lector.nextInt();
	       
	     Arrays.sort(w);
	     me=0;
	     child=0;
	     c=1;
	     
	     if(k>n-k){
	       group=k;
         }else
	       group=n-k;
	       

	     for(int i=n-1;i>=0;i--) 
         {
	        if(c<=group) 
	          me=me+w[i];
	        else
	          child=child+w[i]; 
	        c++;
	     }
	     
	     diff=me-child;
	     
	     System.out.println(diff);
	       
	     t--;
	   }
	}
}