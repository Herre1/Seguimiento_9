import java.util.*;
import java.lang.*;
import java.io.*;

class RacingHorses
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
        Scanner lector = new Scanner(System.in);
        int T = lector.nextInt();
        while (T>0)
        {
            int N = lector.nextInt();
            int[] s = new int[N];
            for (int i = 0; i < N; i++)
                s[i] = lector.nextInt();
                
            Arrays.sort(s);
            int min = Integer.MAX_VALUE;
            
            for (int i = 0; i < N-1; i++) {
                if (s[i+1]-s[i]<min)
                    min = s[i+1]-s[i];
            }
            
            System.out.println(min);
            T--;
        }
    }
}