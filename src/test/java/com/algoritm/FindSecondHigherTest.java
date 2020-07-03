package com.algoritm;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FindSecondHigherTest {

    @Test
    public void testOneNumber() {
        List<Integer> positive = new ArrayList(){{add(1);}};
        List<Integer> negative = new ArrayList(){{add(-1);}};
        List<Integer> zero = new ArrayList(){{add(0);}};

        Assert.assertEquals(1, SecondHigher.find(positive));
        Assert.assertEquals(-1, SecondHigher.find(negative));
        Assert.assertEquals(0, SecondHigher.find(zero));
    }

    @Test
    public void testTwoNumbers() {
        List<Integer> positivesA = new ArrayList(){{add(7); add(5);}};
        List<Integer> positivesB = new ArrayList(){{add(5); add(7);}};
        List<Integer> negativesA = new ArrayList(){{add(-1); add(-3);}};
        List<Integer> negativesB = new ArrayList(){{add(-3); add(-1);}};
        List<Integer> positiveNegativeA = new ArrayList(){{add(1); add(0);}};
        List<Integer> positiveNegativeB = new ArrayList(){{add(0); add(1);}};
        List<Integer> negativePositiveA = new ArrayList(){{add(-1); add(0);}};
        List<Integer> negativePositiveB = new ArrayList(){{add(0); add(-1);}};
        List<Integer> zeros = new ArrayList(){{add(0); add(0);}};
        List<Integer> zeroPositiveA = new ArrayList(){{add(0); add(1);}};
        List<Integer> zeroPositiveB = new ArrayList(){{add(1); add(0);}};
        List<Integer> zeroNegativeA = new ArrayList(){{add(0); add(-1);}};
        List<Integer> zeroNegativeB = new ArrayList(){{add(-1); add(0);}};

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
        List<Integer> arrayA = new ArrayList(){{add(3); add(4); add(5);}};
        List<Integer> arrayB = new ArrayList(){{add(5); add(4); add(3);}};
        List<Integer> arrayC = new ArrayList(){{add(5); add(-1); add(2);}};
        List<Integer> arrayD = new ArrayList(){{add(-2); add(-3); add(-4);}};
        List<Integer> arrayE = new ArrayList(){{add(-3); add(-2); add(-1);}};
        List<Integer> arrayF = new ArrayList(){{add(5); add(-2); add(-1);}};
        List<Integer> arrayG = new ArrayList(){{add(-3); add(0); add(1);}};

        Assert.assertEquals(4, SecondHigher.find(arrayA));
        Assert.assertEquals(4, SecondHigher.find(arrayB));
        Assert.assertEquals(2, SecondHigher.find(arrayC));
        Assert.assertEquals(-3, SecondHigher.find(arrayD));
        Assert.assertEquals(-2, SecondHigher.find(arrayE));
        Assert.assertEquals(-1, SecondHigher.find(arrayF));
        Assert.assertEquals(0, SecondHigher.find(arrayG));
    }
}
