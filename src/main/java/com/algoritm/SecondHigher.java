package com.algoritm;

public class SecondHigher {
    public static int find(int[] unsortedArray) {
        int firstNumber = unsortedArray[0];
        int secondNumber = unsortedArray[0];

        for(int i = 1; i < unsortedArray.length; i++) {
            if(firstNumber < unsortedArray[i]) {
                secondNumber = firstNumber;
                firstNumber = unsortedArray[i];
            } else if (secondNumber < unsortedArray[i] || firstNumber == secondNumber) {
                secondNumber = unsortedArray[i];
            }
        }

        return secondNumber;
    }
}
