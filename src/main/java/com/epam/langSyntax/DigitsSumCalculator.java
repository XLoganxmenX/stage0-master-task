package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        String[] numToString = String.valueOf(number).split("");
        int sumResult = 0;
        for (int i = 0; i < numToString.length; i++){
            int parseNum = Integer.parseInt(numToString[i]);
            sumResult += parseNum;
        }
        System.out.println(sumResult);
    }

}
