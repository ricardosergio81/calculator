package br.com.ricardorosa.calculator;

import br.com.ricardorosa.calculator.operations.Calculate;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputValue = ""; ;
        Calculate calc = new Calculate();

        System.out.println("Input a valid number \n Or + - * / \n Or string like 1+1-10  \n Or x to Exit");

        while (!inputValue.equals("x")){

            System.out.println("Input value: ");
            inputValue = scanner.next();

            if(!inputValue.equals("x")) {
                calc.input(inputValue);
                System.out.println("Result: " + calc.getResult() + "\n");
            }
        }

        System.out.println("Thank you!");

    }
}
