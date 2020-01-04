package br.com.ricardorosa.calculator.operations;

public class MethodAddition implements Method {

    @Override
    public Double execute(Double number1, Double number2) {
        return number1 + number2;
    }
}
