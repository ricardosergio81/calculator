package br.com.ricardorosa.calculator;

import br.com.ricardorosa.calculator.operations.Operation;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputValue = ""; ;
        Operation calc = new Operation();

        System.out.println("Input a valid number \n Or + - * / \n Or x to Exit");

        while (!inputValue.equals("x")){

            System.out.println("Input value: ");
            inputValue = scanner.next();

            if(!inputValue.equals("x")) {
                calc.inputValue(inputValue);
                System.out.println("Result: " + calc.getResult());
            }
        }

        System.out.println("Thank you!");

    }
}
