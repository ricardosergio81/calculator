package test.br.com.ricardorosa.calculator.operations;

import br.com.ricardorosa.calculator.operations.OperationString;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculateString {
    @Test
    public void OnePlusTwoEqualTwoTest(){
        OperationString operation = new OperationString();
        operation.inputString("1+2");
        Assert.assertNotEquals(2.0, operation.getResult(),0.0);
    }

    @Test
    public void OnePlusOneEqualTwoTest(){
        OperationString operation = new OperationString();

        operation.inputString("1+1");

        Assert.assertEquals(2.0, operation.getResult(),0.0);
    }


    @Test
    public void OneMultipleOperationPlusOneTest(){
        OperationString operation = new OperationString();

        operation.inputString("1+-*/+1");
        Assert.assertEquals(2.0, operation.getResult(),0.0);
    }

}
