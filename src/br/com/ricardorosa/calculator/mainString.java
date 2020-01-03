package br.com.ricardorosa.calculator;

import br.com.ricardorosa.calculator.operations.OperationString;

import java.util.Scanner;

public class mainString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputValue = ""; ;
        OperationString calc = new OperationString();

        System.out.println("Input a string with valid number \n And + - * / \n Or x to Exit");

        while (!inputValue.equals("x")){

            System.out.println("Input value: ");
            inputValue = scanner.next();

            if(!inputValue.equals("x")) {
                calc.inputString(inputValue);
                System.out.println("Result: " + calc.getResult() + "\n");
            }
        }

        System.out.println("Thank you!");

    }
}
