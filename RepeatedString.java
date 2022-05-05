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
        String s = sc.next();
        long n = sc.nextLong();
        long amount = n/s.length();
        long remainder = n%s.length();
        long total = 0;
        for(int i = 0; i<s.length();i++){
            if(s.charAt(i)=='a')
                total++;
        }
        total = total*amount;
        for(int i = 0; i<remainder; i++){
            if(s.charAt(i)=='a')
                total++;
        }
        System.out.println(total);
    }
}
