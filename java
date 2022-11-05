import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
     int x;
        x=sc.nextInt();
       int a=x*100;
        int b=a/10;
        int c=a-b;
          if (a>1000) {
              System.out.println(c);
              }
        else {
            System.out.println(a);
            }
        }
    }
