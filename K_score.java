//K-Goodnes string
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

        while(test-- > 0)
        {   
            int size = sc.nextInt();
            //required K-score to reach
            int K_res = sc.nextInt();
            //take up the '\n' character in input buffer
            String trash = sc.nextLine();
            String str = sc.nextLine();
            //actual K-score of given string
            int K_act=0;
            //counting the K_act goodness score
            for(int i=0;i <size/2;i++)
            {
                if(str.charAt(i) != str.charAt(size -1 -i))
                    ++K_act;
            }
            //if given score and required score are equal minimum steps is 0
            if(K_act == K_res)
                System.out.println("Case #"+Case+": "+0);
            else
                //difference of required score and acutal score give minimum no of steps
                System.out.println("Case #"+Case+": "+Math.abs(K_res - K_act));

            ++Case;
        }
    }
    
}
