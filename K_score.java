import java.io.*;
import java.util.*;
import java.lang.Math;

public class K_score
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();
        int Case=1;
        //System.out.println("the test case is "+test);
        while(test-- > 0)
        {   
            int size = sc.nextInt();
         //   System.out.println("the size is "+size);
            int K_res = sc.nextInt();
            String trash = sc.nextLine();
          //  System.out.println("the required score is "+K_res);
            String str = sc.nextLine();

            int K_act=0;
            for(int i=0;i <size/2;i++)
            {
                if(str.charAt(i) != str.charAt(size -1 -i))
                    ++K_act;
            }

            if(K_act == K_res)
                System.out.println("Case #"+Case+": "+0);
            else
                System.out.println("Case #"+Case+": "+Math.abs(K_res - K_act));

            ++Case;
        }
        
    }
}
