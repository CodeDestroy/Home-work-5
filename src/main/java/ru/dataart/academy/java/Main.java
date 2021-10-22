package ru.dataart.academy.java;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Calculator get number of 1: " +
                calculator.getNumberOfChar("src/main/resources/test.zip", '1'));
        System.out.println("Calculator get max length: " +
                calculator.getMaxWordLength("src/main/resources/test1.zip"));
    }
}