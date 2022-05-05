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
        long p = sc.nextInt();
        long q = sc.nextInt();
        int numCount = 0;
        
        for(long i = p; i<=q ;i++){
            if(isKaprekar(i)){
                System.out.print(i);
                System.out.print(" ");
                numCount++;
            }
        }
        if(numCount == 0)
            System.out.println("INVALID RANGE");
    }
    
    public static boolean isKaprekar(long n){
        long num = n;
        int digits = 0;
        long div = 1;
        
        while(num>0){
            num = num/10;
            digits++;
            div*=10;
        }
        
        long square = n*n;
        long left = square/div;
        long right = square%div;
        
        return (left+right)==n;
    }
}
