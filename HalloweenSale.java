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
        
        int initialCost = sc.nextInt();
        int difference = sc.nextInt();
        int minimum = sc.nextInt();
        int budget = sc.nextInt();
        
        
        
        int count = 0;
        int nextPrice = initialCost;
        while(budget >= nextPrice) {
            count++;
            budget -= nextPrice;
            nextPrice = Math.max(nextPrice-difference, minimum);
        }
        
        
        System.out.println(count);
    }
}
