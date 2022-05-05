import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       
       for(int i = 0; i<t ; i++){
           
           
           int n = sc.nextInt();
           int c = sc.nextInt();
           int m = sc.nextInt(); //2
            
            int bars = n/c; //15/3 = 5
            int wrappers = n/c; //15/3 = 5
            int count = bars; //5
           
           while(wrappers>=m){
               
               count += wrappers/m ;//5/2 = 2
               wrappers = wrappers/m + wrappers%m; //5/2+ 5%2 = 1
           }
           System.out.println(count);
       }
    }
}
