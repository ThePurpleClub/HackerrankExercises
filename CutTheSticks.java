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
        
        for(int i = 0; i<n ;i++)
        {
            int input = sc.nextInt();
            
            arr[i] = input;
        }
        Arrays.sort(arr);
        
        int count = 0;
        int sticks = n;
        int curr = arr[0];
        System.out.println(sticks);
        for(int i = 0; i<n; i++){
            if(arr[i]==curr)count++;
            else{
                sticks -= count;
                count = 1;
                curr = arr[i];
                System.out.println(sticks);
            }
        }
    }
}
