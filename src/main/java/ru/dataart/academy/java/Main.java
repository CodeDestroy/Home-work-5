package ru.dataart.academy.java;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Calculator get number of 1: " +
                calculator.getNumberOfChar("/home/andrey/vrn-java-06/vrn-java-06/src/main/resources/test.zip", '1'));
        System.out.println("Calculator get max length: " +
                calculator.getMaxWordLength("/home/andrey/vrn-java-06/vrn-java-06/src/main/resources/test1.zip"));
    }
}