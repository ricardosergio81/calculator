package test.br.com.ricardorosa.calculator.operations;

import br.com.ricardorosa.calculator.operations.Operation;
import org.junit.Assert;
import org.junit.Test;

public class TestOperation {
    @Test
    public void OnePlusTwoEqualTwoTest(){
        Operation operation = new Operation();

        operation.inputValue("1");
        operation.inputValue("+");
        operation.inputValue("2");

        Assert.assertNotEquals(2.0, operation.getResult(),0.0);
    }

    @Test
    public void OnePlusOneEqualTwoTest(){
        Operation operation = new Operation();

        operation.inputValue("1");
        operation.inputValue("+");
        operation.inputValue("1");

        Assert.assertEquals(2.0, operation.getResult(),0.0);
    }


    @Test
    public void OneMultipleOperationPlusOneTest(){
        Operation operation = new Operation();

        operation.inputValue("1");
        operation.inputValue("+");
        operation.inputValue("-");
        operation.inputValue("*");
        operation.inputValue("/");
        operation.inputValue("+");
        operation.inputValue("1");

        Assert.assertEquals(2.0, operation.getResult(),0.0);
    }

}
