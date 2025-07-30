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
        if(n>=0)
        {
            System.out.println("+"+n);
        }
        else
        {
            System.out.println(n);
        }
    }
}
