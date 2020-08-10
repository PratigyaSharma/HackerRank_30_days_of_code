import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

       int a;
        double b;
        String str;
        a=scan.nextInt();
        b=scan.nextDouble();
        scan.nextLine();
        str=scan.nextLine();
        
        System.out.println(i+a);
        System.out.println(d+b);
        System.out.println(s+str);

        scan.close();
    }
}