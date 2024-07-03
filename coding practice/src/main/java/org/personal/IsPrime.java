package org.personal;

public class IsPrime {


    public static void main(String[] args) {
        IsPrime obj = new IsPrime();
        int n = 12;
        if (obj.isPrime(n)) {
            System.out.println("Prime");

        } else
            System.out.println("Not Prime");

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}

