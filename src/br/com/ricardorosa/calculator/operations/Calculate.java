package br.com.ricardorosa.calculator.operations;

public class Calculate {

    private Double result = 0.0;
    private Double inputValue;
    private String inputOperation = "";

    public void input(String inputValue) throws NumberFormatException {

        if( MethodsEnum.contains(inputValue)) {
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

    private void execute(){
        Method method = MethodsEnum.returnMethod(inputOperation);
        this.result = method.execute(this.result,this.inputValue);
    }

    public Double getResult(){
        return this.result;
    }


}
