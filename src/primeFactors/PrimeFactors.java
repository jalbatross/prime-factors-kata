package primeFactors;

import java.util.ArrayList;
import java.util.*;

public class PrimeFactors {
    public static List<Integer> generate(int num) {
        ArrayList<Integer> factors = new ArrayList<Integer>();
        
        int lowestFactor = lowestFactor(num);
        if (lowestFactor == 1) {
            factors.add(num);
        }
        else {
            factors.addAll(generate(num/lowestFactor));
            factors.addAll(generate(lowestFactor));
        }
        
        Collections.sort(factors);
        return factors;
    }
    
    private static int lowestFactor(int n) {
        double sqrtN = Math.sqrt(n);
        
        for (int i = 2; i <= sqrtN; i++ ) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
