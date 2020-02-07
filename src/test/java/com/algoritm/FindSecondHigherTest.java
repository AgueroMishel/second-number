package com.algoritm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class FindSecondHigherTest {

    @Test
    public void testOneNumber() {
        int[] positive = {1};
        int[] negative = {-1};
        int[] zero = {0};

        Assert.assertEquals(1, SecondHigher.find(positive));
        Assert.assertEquals(-1, SecondHigher.find(negative));
        Assert.assertEquals(0, SecondHigher.find(zero));
    }

    @Test
    public void testTwoNumbers() {
        int[] positivesA = {7, 5};
        int[] positivesB = {5, 7};
        int[] negativesA = {-1, -3};
        int[] negativesB = {-3, -1};
        int[] positiveNegativeA = {1, 0};
        int[] positiveNegativeB = {0, 1};
        int[] negativePositiveA = {-1, 0};
        int[] negativePositiveB = {0, -1};
        int[] zeros = {0, 0};
        int[] zeroPositiveA = {0, 1};
        int[] zeroPositiveB = {1, 0};
        int[] zeroNegativeA = {0, -1};
        int[] zeroNegativeB = {-1, 0};

        Assert.assertEquals(5, SecondHigher.find(positivesA));
        Assert.assertEquals(5, SecondHigher.find(positivesB));
        Assert.assertEquals(-3, SecondHigher.find(negativesA));
        Assert.assertEquals(-3, SecondHigher.find(negativesB));
        Assert.assertEquals(0, SecondHigher.find(positiveNegativeA));
        Assert.assertEquals(0, SecondHigher.find(positiveNegativeB));
        Assert.assertEquals(-1, SecondHigher.find(negativePositiveA));
        Assert.assertEquals(-1, SecondHigher.find(negativePositiveB));
        Assert.assertEquals(0, SecondHigher.find(zeros));
        Assert.assertEquals(0, SecondHigher.find(zeroPositiveA));
        Assert.assertEquals(0, SecondHigher.find(zeroPositiveB));
        Assert.assertEquals(-1, SecondHigher.find(zeroNegativeA));
        Assert.assertEquals(-1, SecondHigher.find(zeroNegativeB));
    }

    @Test
    public void testThreeNumbers() {
        int[] arrayA = {3, 4, 5};
        int[] arrayB = {5, 4, 3};
        int[] arrayC = {5, -1, 2};
        int[] arrayD = {-2, -3, -4};
        int[] arrayE = {-3, -2, -1};
        int[] arrayF = {5, -2, -1};
        int[] arrayG = {-3, 0, 1};

        Assert.assertEquals(4, SecondHigher.find(arrayA));
        Assert.assertEquals(4, SecondHigher.find(arrayB));
        Assert.assertEquals(2, SecondHigher.find(arrayC));
        Assert.assertEquals(-3, SecondHigher.find(arrayD));
        Assert.assertEquals(-2, SecondHigher.find(arrayE));
        Assert.assertEquals(-1, SecondHigher.find(arrayF));
        Assert.assertEquals(0, SecondHigher.find(arrayG));
    }
}
