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
        int m = sc.nextInt();
        BigInteger[] bi = new BigInteger[n];
        String[] topic = new String[n];
        
        for(int i = 0; i<n ; i++)
            topic[i] = sc.next();
            
        
        for(int i = 0; i<n; i++){
            bi[i] = new BigInteger(topic[i], 2);
        }
        int maxBitCount = 0;
        int teamCount = 0;
        for(int i = 0; i<n;i++){
            for(int j = i; j< n ; j++){
                BigInteger iOrj = bi[i].or(bi[j]);
                int count = iOrj.bitCount();
                if(count> maxBitCount){
                    maxBitCount = count;
                    teamCount = 1;
                }
                else if(count == maxBitCount)
                    teamCount++;
                
            }
        }
        System.out.println(maxBitCount);
        System.out.println(teamCount);
    }
}
