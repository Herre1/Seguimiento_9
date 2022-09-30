import java.util.Scanner;
import java.util.Arrays;
import java.util.*;
import java.io.*;


public class HelpfulMaths {

    public static void main(String[] args) {
       
        Scanner lector = new Scanner(System.in);

        String str=lector.nextLine();
        String sym="\\+";

        String[] simbolos=sym.split(sym);

        int[] numeros = new int[simbolos.length];

        for (int i=0 ; i<simbolos.length;i++)
        {
        numeros[i]=Integer.parseInt(simbolos[i]);
        }

        Arrays.sort(numeros);

        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]+"+");
        }

    }
}