import java.util.Arrays;
import java.util.Scanner;
 
public class SpykeTalks {
    public static void main(String[] args) 
    {
        Scanner lector = new Scanner(System.in);
        new SpykeTalks().go(lector);
    }
    public void go(Scanner lector)
    {
        int a = lector.nextInt();
        int temp = 0;
        int result = 0;
        boolean flag = false;
        int[] arr = new int[a];
        while (a-- > 0){
            arr[a] = lector.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] == arr[i + 1] && arr[i] != 0) temp++;
            else temp = 0;
            if(temp == 1) result++;
            if(temp > 1) flag = true;
            
        }
        System.out.print(flag? -1 : result);
    }
}