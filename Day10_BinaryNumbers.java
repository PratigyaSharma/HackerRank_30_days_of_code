import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) 
    {
        int r,i=0,count=0,min=0;
        int arr[]=new int[32];
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(n > 0)
        {
            while(n>0)
            {
            
            if(n%2==1)
                {
                
                count++; 
                  if(count>=min)
                   {
                     min=count;
                   }
                }
            else
                {
                 count=0;
                 }
            
        n=n/2;
            //System.out.println(n);
            //System.out.println(min);
        }
        System.out.println(min);
        }
        
        scanner.close();
    }
}