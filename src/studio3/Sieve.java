package studio3;

import java.util.Scanner;

public class Sieve {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find prime numbers upto that number: ");
        int n = sc.nextInt();

        boolean prime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int j = 2; j * j <= n; j++) {
            // If prime[p] is not changed, then it is a prime
            if (prime[j] == true) {
                // Update all multiples of p
                for (int i = j * j; i <= n; i += j)
                    prime[i] = false;
            }
        }
        sc.close();

        // Print all prime numbers
        for (int i = 2; i <= n; i++) {
            if (prime[i] == true)
                System.out.print(i + " ");
        }
    }
}