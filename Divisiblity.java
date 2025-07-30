import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        int a;
    a= scanner.nextInt();
        if(a%3==0)
            System.out.println("The number is divisible by 3");
            else
                System.out.println("The number is not divisible by 3 and gives a remainder "+a%3);
    }
}
