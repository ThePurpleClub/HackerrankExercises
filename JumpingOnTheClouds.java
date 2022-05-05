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
       int n = sc.nextInt();
       int[] arr = new int[n];
       
       for(int i = 0; i<n ;i++){
           arr[i] = sc.nextInt();
       }
       int steps = 0;
       int count = 0;
       
       while(steps< n-1){
           if (steps + 2 <= n - 1 && arr[steps + 2] != 1)
               steps+=2;
           else{
               steps+=1;
           }
        count++;
    
            }
            System.out.println(count);       
       }
    }
    
