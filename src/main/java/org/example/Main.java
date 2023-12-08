package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Integer.toBinaryString(123).toCharArray()

        SolutionHammingWeight wt = new SolutionHammingWeight();
        System.out.println( wt.hammingWeight(-3) );

        //int[] test = {1, 2, 3, 6, 4, 1};
        int[] test = {-1, -2};
        int[] output = sortNDedup(test);

        for (int j : output) {
            System.out.println(j);
        }

        int result =1;
        for (int i =0; i < output.length && result< Integer.MAX_VALUE ; i++)
        {
            if  ( result == output[i])
                result++;
            else
            {
                if (result < output[i])
                    break;
            }
        }

        System.out.println(result);



    }

    private static int[] sortNDedup(int[] input){
        int[] output;
        int temp;
        for (int i =0 ; i < input.length; i++){
            for ( int j =i+1; j < input.length ; j++)
            {
                if(input[i] > input[j]){
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }

        // find dups
        int dups =0;
        for (int i =1; i < input.length; i++)
        {
            if(input[i] == input[i-1])
                dups++;
        }
        //System.out.println(dups);
        output= new int[input.length-dups];
        int k =0;
        output[0] = input[0];
        for (int i =1; i < input.length; i++)
        {
            //System.out.println(i + " " +k);

            if(input[i] != input[i-1]) {
                k++;
                output[k] = input[i];

            }

            //System.out.println("Value "+ output[k] + " " +input[i]);
        }



        return output;

    }
}