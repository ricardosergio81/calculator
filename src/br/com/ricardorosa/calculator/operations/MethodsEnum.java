package br.com.ricardorosa.calculator.operations;

public enum MethodsEnum {

    ADDITION("+", new MethodAddition()),
    DIVISION("/", new MethodDivision()),
    MULTIPLICATION("*", new MethodMultiplication()),
    SUBTRACTION("-", new MethodSubtraction());

    private  String value;
    private  Method method;

    MethodsEnum(String value, Method method){
        this.value = value;
        this.method = method;
    }

    public static Method returnMethod(String text) {
        MethodsEnum method = MethodsEnum.returnEnum(text);
        return method.method;
    }

    public static boolean contains(String text) {
        MethodsEnum method = MethodsEnum.returnEnum(text);
        if(method == null) {
            return false;
        } else {
            return true;
        }
    }

    private static MethodsEnum returnEnum(String text){
        for (MethodsEnum b : MethodsEnum.values()) {
            if (b.value.equals(text)) {
                return b;
            }
        }
        return null;
    }
}
