package org.personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsPrimeTest {
    IsPrime isPrime = new IsPrime();

    @Test
    public void testIsnumberIsprime() {
        //Given
        int number = 7;
        //When
        boolean result = isPrime.isPrime(number);
        //Then
        assertTrue(result,"Number should be prime");

    }

    @Test
    public void testNotPrimeNumber() {
        //Arrange
        int number = 8;
        //Act
        boolean result = IsPrime.isPrime(number);
        //Assert
        assertFalse(result,"Number should not be prime");
    }

}