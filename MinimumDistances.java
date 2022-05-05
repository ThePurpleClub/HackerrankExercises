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
        HashMap<Integer, Integer> hash = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
            if(hash.containsKey(arr[i])){
                int diff = Math.abs(hash.get(arr[i])-i);
                if(diff < min)
                    min = diff;
            }
            hash.put(arr[i], i);
        }
        if(min == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(min);
    }
}
