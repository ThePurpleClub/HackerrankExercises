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
        int d = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i<n ;i++)
            arr[i] = sc.nextInt();
            
        HashSet<Integer> hash = new HashSet<>();
        for(int i = 0; i<n ;i++){
            if(!hash.contains(arr[i]))
                hash.add(arr[i]);
        }
        
        int triplets = 0;
        for(int a :arr){
            if(hash.contains(a+d) && hash.contains(a+d*2))
                triplets++;
        }
        
        System.out.println(triplets);        
    }
}
