package com.utel.main;

import com.utel.service.OperationImpl;

/**
 * Created by abdulqadir on 1/21/17.
 */
public class AppMain {
    public static void main(String[] args) {
        OperationImpl operation = new OperationImpl();
        String[] temp;
        if(args.length > 0 ){
            Calculation calculation = new Calculation(args[0]);
            calculation.process();
        }else{
            System.out.println("no input");
        }
    }
}
