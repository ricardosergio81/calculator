package br.com.ricardorosa.calculator.operations;

public class OperationString {

    Operation operation = new Operation();

    public void inputString(String inputValue) {
        Integer i =0 ;
        Character inputPart ;
        String input ="";
        while( i < inputValue.length() ) {
            inputPart = inputValue.charAt(i);

            if(inputPart == '+' || inputPart == '-' || inputPart == '*' || inputPart == '/') {
                if(!input.equals("")){
                    operation.inputValue(input);
                    input = "";
                }
                operation.inputValue(inputPart.toString());
            } else {
                input = new StringBuilder().append(input).append(inputPart).toString();
            }
           i++;
        }

        if(!input.equals("")){
            operation.inputValue(input);
        }
    }

    public Double getResult(){
        return operation.getResult();
    }

}
