package com.algoritm;

import java.util.List;

public class SecondHigher {
    public static int find(List<Integer> unsortedList) {
        if(!unsortedList.isEmpty() && unsortedList != null) {
            int firstNumber = unsortedList.get(0);
            int secondNumber = unsortedList.get(0);

            for(int currentInteger : unsortedList) {
                if(firstNumber < currentInteger) {
                    secondNumber = firstNumber;
                    firstNumber = currentInteger;
                } else if (secondNumber < currentInteger || firstNumber == secondNumber) {
                    secondNumber = currentInteger;
                }
            }

            return secondNumber;
        } else {
            return 0;
        }
    }
}
