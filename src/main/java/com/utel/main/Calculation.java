package com.utel.main;

import com.utel.service.OperationImpl;

/**
 * Created by abdulqadir on 1/21/17.
 */
public class Calculation {
    private OperationImpl operation = new OperationImpl();
    String input;
    public Calculation(String input) {
        this.input = input;
    }

    public void process() {
        String[] temp;
        if(input.contains("+")){
            temp = input.split("\\+");
            operation.addition(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        }
        if(input.contains("-")){
            temp = input.split("-");
            operation.subtraction(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        }
        if(input.contains("*")){
            temp = input.split("\\*");
            operation.multification(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        }
        if(input.contains("/")){
            temp = input.split("/");
            operation.division(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
        }
    }
}
