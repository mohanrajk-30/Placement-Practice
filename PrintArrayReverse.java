import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int arr[] = new int[n];
        for(int i= 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            
            System.out.print(arr[i]+" ");
        }
    }
}
