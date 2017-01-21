package com.utel.service;

/**
 * Created by abdulqadir on 1/21/17.
 */
public class OperationImpl implements Operation {
    @Override
    public void addition(int firstNumber, int secondNumber) {
        System.out.println(firstNumber+secondNumber);
    }

    @Override
    public void subtraction(int firstNumber, int secondNumber) {
        System.out.println(firstNumber-secondNumber);
    }

    @Override
    public void multification(int firstNumber, int secondNumber) {
        System.out.println(firstNumber*secondNumber);
    }

    @Override
    public void division(int firstNumber, int secondNumber) {
        System.out.println(firstNumber/secondNumber);
    }
}
