import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n+1];
        int pos,data;
        for(int i=0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        data = scanner.nextInt();
        pos = scanner.nextInt();
        for(int i=n;i>pos-1;i--) {
            arr[i] = arr[i-1];
        }
        arr[pos-1]=data;
        
        for(int i=0;i<=n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}
