package br.com.ricardorosa.calculator.operations;

import java.util.regex.Pattern;

public class Calculate {

    private Double result = 0.0;
    private Double inputValue;
    private String inputOperation = "";

    public void input(String inputValue) throws NumberFormatException {
        Pattern digitPattern = Pattern.compile("((\\d+[\\.]{0,1}\\d*)|([\\+\\-\\*\\/]{1}))");
        Pattern digitOperationPattern = Pattern.compile("[(\\d+[\\.]{0,1}\\d*)\\-\\+\\*\\/]+");

        if(digitPattern.matcher(inputValue).matches()) {
            this.inputValue(inputValue);
        } else if(digitOperationPattern.matcher(inputValue).matches()){
            this.inputString(inputValue);
        } else {
            throw new NumberFormatException();
        }

    }

     private void inputValue(String inputValue)  throws NumberFormatException{
         if( MethodsEnum.contains(inputValue)) {
             System.out.println(inputValue);
             this.inputOperation = inputValue;
         } else {
             this.inputValue = Double.valueOf(inputValue);
             if( this.inputOperation.equals("") ){
                 this.result = this.inputValue;
             } else {
                 this.execute();
                 this.inputOperation = "";
             }
         }
     }

    private void inputString(String inputValue)  throws NumberFormatException {
        Integer i = 0 ;
        Character inputPart ;
        StringBuilder input = new StringBuilder();

        while( i < inputValue.length() ) {
            inputPart = inputValue.charAt(i);
            if( MethodsEnum.contains(inputPart.toString())) {
                 if(!input.equals("")){
                    this.inputValue(input.toString());
                    input.setLength(0);
                }
                this.inputValue(inputPart.toString());
            } else {
                input.append(inputPart);
            }
            i++;
        }

        if(!input.equals("")){
            this.inputValue(input.toString());
        }
    }


    private void execute(){
        Method method = MethodsEnum.returnMethod(inputOperation);
        this.result = method.execute(this.result,this.inputValue);
    }

    public Double getResult(){
        return this.result;
    }

}