package org.personal;

public class IsOddOrEven {

    public boolean checkOddOrEven(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        IsOddOrEven obj = new IsOddOrEven();
        int arr[] = { 3, 7,5,12 };
        if (obj.checkOddOrEven(arr))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}

