import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        int a;
        a = scanner.nextInt();
        if (a>0)
            System.out.println("Positive");
        else if(a<0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
        
    }
}
