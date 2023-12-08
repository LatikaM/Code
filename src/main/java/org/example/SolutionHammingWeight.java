package org.example;

public class SolutionHammingWeight {

    public int hammingWeight(int n) {

        int wt =0;

        int size =32;


        while (size > 0 )
        {
            //System.out.println("( n  | one )  " + ( n  & one ));
            if( ( n  & 1 ) != 0){
                wt++;
            }
            n >>=1;
            size--;
            //System.out.println(n);
        }
        return wt;

    }
}
