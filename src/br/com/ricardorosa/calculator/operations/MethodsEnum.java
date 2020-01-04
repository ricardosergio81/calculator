package br.com.ricardorosa.calculator.operations;

public enum MethodsEnum {

    ADDITION("+", new MethodAddition()),
    DIVISION("/", new MethodDivision()),
    MULTIPLICATION("/", new MethodMultiplication()),
    SUBTRATION("-", new MethodSubtration());

    private  String value;
    private  Method method;

    MethodsEnum(String value, Method method){
        this.value=value;
        this.method=method;
    }

    public static Method returnMethod(String text) {
        for (MethodsEnum b : MethodsEnum.values()) {
            if (b.value.equalsIgnoreCase(text)) {
                return b.method;
            }
        }
        return null;
    }
}
