package Hw14;

import Replit.main;

public class Prime2 {

    boolean isPrime(int num) {
        boolean found = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
              return false;
            }
        }
        return found;
    }
    public static void main(String[] args) {
        Prime2 obj = new Prime2();
       boolean result = obj.isPrime(3);
        System.out.println(result);

    }
}
