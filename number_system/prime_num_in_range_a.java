import java.util.*;

class prime_num_in_range {
    // Function to return primes in range [a, b]
    public List<Integer> segmentedSieve(int a, int b) {
        // Find all primes up to sqrt(b)
        int limit = (int) Math.sqrt(b);
        boolean[] isPrime = new boolean[limit + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        // Sieve of Eratosthenes
        for (int i = 2; i * i <= limit; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= limit; j += i)
                    isPrime[j] = false;
            }
        }

        // Store small primes
        List<Integer> smallPrimes = new ArrayList<>();
        for (int i = 2; i <= limit; i++) {
            if (isPrime[i]) smallPrimes.add(i);
        }

        // Initialize range array
        boolean[] isPrimeRange = new boolean[b - a + 1];
        Arrays.fill(isPrimeRange, true);

        // Mark non-primes in range [a, b]
        for (int p : smallPrimes) {
            int start = Math.max(p * p, ((a + p - 1) / p) * p);
            for (int j = start; j <= b; j += p)
                isPrimeRange[j - a] = false;
        }

        // Store result
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < isPrimeRange.length; i++) {
            if (isPrimeRange[i] && (i + a) > 1)
                result.add(i + a);
        }

        return result;
    }
}

// Driver class
public class prime_num_in_range_a {
    public static void main(String[] args) {
        int a = 10, b = 30;
        prime_num_in_range obj = new prime_num_in_range();
        List<Integer> primes = obj.segmentedSieve(a, b);
        for (int p : primes) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}