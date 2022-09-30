 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Barrels {
 
	static Scanner lector = new Scanner(System.in);
	public static void main(String[] args) {
			
		int casosPrueba = lector.nextInt();
		while(casosPrueba != 0) {
			
			long n = lector.nextLong();
			long k = lector.nextLong();
			List<Long> lista = new ArrayList<Long>();
			
			while(n != 0) {
				
				lista.add(lector.nextLong());
				n--;
			}
			
			Collections.sort(lista);
			
			long sum = lista.get(lista.size()-1);
			for(int i = lista.size()-2; i > lista.size()-k-2; i--) {
				sum = sum + lista.get(i);
			}
			System.out.println( sum);
			casosPrueba--;
		}
	}
 
}
 
 	  