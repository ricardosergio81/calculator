package test.br.com.ricardorosa.calculator.operations;

import br.com.ricardorosa.calculator.operations.Calculate;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculateString {
    @Test
    public void OnePlusTwoEqualTwoTest(){
        Calculate operation = new Calculate();
        operation.input("1+2");
        Assert.assertNotEquals(2.0, operation.getResult(),0.0);
    }

    @Test
    public void OnePlusOneEqualTwoTest(){
        Calculate operation = new Calculate();

        operation.input("1+1");

        Assert.assertEquals(2.0, operation.getResult(),0.0);
    }

    @Test
    public void DoubleInputValueTest(){
        Calculate operation = new Calculate();

        operation.input("1.0+1.0");

        Assert.assertEquals(2.0, operation.getResult(),0.0);
    }


    @Test
    public void OneMultipleOperationPlusOneTest(){
        Calculate operation = new Calculate();

        operation.input("1+-*/+1");
        Assert.assertEquals(2.0, operation.getResult(),0.0);
    }

}
