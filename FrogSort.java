import java.util.*;
import java.lang.*;
import java.io.*;

class FrogSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner lector = new Scanner(System.in);
		int T =  lector.nextInt();
        for(int j=0;j<T;j++){
            int n = lector.nextInt();
            Pares[] p = new Pares[n];
            for(int i=0;i<n;i++){
                Pares t = new Pares(lector.nextInt(),i);
                p[i]=t;
            }
            int[] l = new int[n];
            for(int i=0;i<n;i++){
                l[i] = lector.nextInt();
            }
            
            
            Arrays.sort(p,(a,b)->Integer.compare(a.one,b.one));
            int ans =0;
            int lastPos= p[0].two;
            for(int i=1;i<n;i++){
                int cur = p[i].two;
                int index= p[i].two;
                while(cur<=lastPos){
                    cur += l[index];
                    ans++;
                }
                lastPos =cur;
            }
            System.out.println(ans);
            
            
        }
	}   
     public static class Pares
     {
        int one;
        int two;
        
        Pares(int one , int two){
            this.one = one;
            this.two = two;
        }
    }
}