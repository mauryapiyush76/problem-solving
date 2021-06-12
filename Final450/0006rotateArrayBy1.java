// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Compute obj = new Compute();
            obj.rotate(a, n);
            
            StringBuilder output = new StringBuilder();
            for(int i=0;i<n;i++)
                output.append(a[i]+" ");
            System.out.println(output);
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Compute {
    
    public void rotate(long arr[], long n)
    {
        long temp = arr[(int)n-1];
        for(int i = (int)n-1 ; i >= 1 ; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
	
   //method 2
    public void rotateTwoPointers(long arr[], long n)
    {
       int i = 0, j = arr.length - 1;
       while(i != j)
       {
         long temp = arr[i];
         arr[i] = arr[j];
         arr[j] = temp;
         i++;
       }
    }
}
