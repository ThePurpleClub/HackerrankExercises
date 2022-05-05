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
        int n  = sc.nextInt();
        HashMap<Integer, Integer> hash = new HashMap<>();
        
        for(int i = 0; i<n ; i++){
            int num = sc.nextInt();
            hash.put(num,hash.getOrDefault(num, 0)+1);
        }
        
        int max = 0;
        for (Integer h: hash.keySet()){
            if(hash.get(h)>max)
                max= hash.get(h);
        }
        
        System.out.println(n - max);
    }
}
