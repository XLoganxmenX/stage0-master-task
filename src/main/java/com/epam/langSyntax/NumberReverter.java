package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String numToString = String.valueOf(number);
        String reverseString = new StringBuffer(numToString).reverse().toString();
        System.out.println(reverseString);
    }

}
