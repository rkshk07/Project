package org.personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsOddOrEvenTest {
    IsOddOrEven isOddOrEven = new IsOddOrEven();

    @Test
    void testEvenisPresent(){
        int arr[]= {1,3,5,7,12};
       assertTrue(isOddOrEven.checkOddOrEven(arr));
    }
    @Test
    void testEvenIsNotPresent(){
        int arr[] = {3,5,7,9};
        assertFalse(isOddOrEven.checkOddOrEven(arr));
    }

}