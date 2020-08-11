import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {   
        Scanner sc=new Scanner(System.in);
        int d,m,y,rd,rm,ry,fine=0;
        d=sc.nextInt();
        m=sc.nextInt();
        y=sc.nextInt();
        rd=sc.nextInt();
        rm=sc.nextInt();
        ry=sc.nextInt();
        if(y<=ry)
        {
            if(y<ry)
                fine=0;
            else
            {
            if(m<=rm)
            {
                if(d<=rd)
                    fine=0;
                else
                    fine=15*(d-rd);
            }
            else
                fine=500*(m-rm);
            }
        }
        else
            fine=10000;
        System.out.println(fine);
        
    }
}
