package leetcode_contest;

import java.util.Scanner;

public class minimumreqiureprime {
    public static void main(String[] args) {
        /*
         given N and M,find the minimum number of primes required to make N.

you can use the first M primes to do so...

input:

N=10;

M=1;

output:
5

explanation: Minimum we reqiure 5 primes[2,2,2,2,2]

input:
N=11
M=3

output:

3

explanation:Minimum we reqiures 3 primes[2,2,7] 
         
         */

          Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        System.out.print("Enter M: ");
        int M = scanner.nextInt();

        scanner.close();
        int[] primes = generatePrimes(M);

        int minPrimesRequired = calculateMinPrimes(N, primes);

        System.out.println("Minimum number of primes required: " + minPrimesRequired);
    }

    private static int[] generatePrimes(int M) {
        int[] primes = new int[M];
        int count = 0;
        int num = 2;

        while (count < M) {
            if (isPrime(num)) {
                primes[count++] = num;
            }
            num++;
        }

        return primes;
    }

    private static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static int calculateMinPrimes(int N, int[] primes) {
        int minPrimesRequired = 0;
        int product = 1;

        for (int i = 0; i < primes.length; i++) {
            while (N % product == 0 && N != 1) {
                product *= primes[i];
                minPrimesRequired++;
            }
        }

        return minPrimesRequired;
   }
}
