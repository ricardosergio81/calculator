package br.com.ricardorosa.calculator.operations;

public class Operation {

    private Double result = 0.0;
    private Double inputValue;
    private String inputOperation = "";

    public void inputValue(String inputValue){

        if(inputValue.equals("+") || inputValue.equals("-") || inputValue.equals("*") || inputValue.equals("/")){
            this.inputOperation = inputValue;
        } else{
            try {
                this.inputValue = Double.valueOf(inputValue);
                if( this.inputOperation.equals("") ){
                    this.result = this.inputValue;
                } else {
                    this.execute();
                    this.inputOperation ="";
                }
            } catch (NumberFormatException e){
                System.out.println("Invalid Value");
            }
        }
    }

    private void execute(){
        if(inputOperation.equals("+")) {
            this.result +=this.inputValue;
        } else if(inputOperation.equals("-")) {
             this.result -= this.inputValue;
        } else if(inputOperation.equals("*")) {
             this.result *= this.inputValue;
        } else if(inputOperation.equals("/")) {
             this.result /= this.inputValue;
        }

    }

    public Double getResult(){
        return this.result;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "result=" + result +
                '}';
    }
}
