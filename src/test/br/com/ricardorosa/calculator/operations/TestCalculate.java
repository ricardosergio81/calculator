package test.br.com.ricardorosa.calculator.operations;

import br.com.ricardorosa.calculator.operations.Calculate;
import org.junit.Assert;
import org.junit.Test;

public class TestCalculate {
    @Test
    public void OnePlusTwoEqualTwoTest(){
        Calculate operation = new Calculate();

        operation.input("1");
        operation.input("+");
        operation.input("2");

        Assert.assertNotEquals(2.0, operation.getResult(),0.0);
    }

    @Test
    public void OnePlusOneEqualTwoTest(){
        Calculate operation = new Calculate();

        operation.input("1");
        operation.input("+");
        operation.input("1");

        Assert.assertEquals(2.0, operation.getResult(),0.0);
    }


    @Test
    public void OneMultipleOperationPlusOneTest(){
        Calculate operation = new Calculate();

        operation.input("1");
        operation.input("+");
        operation.input("-");
        operation.input("*");
        operation.input("/");
        operation.input("+");
        operation.input("1");

        Assert.assertEquals(2.0, operation.getResult(),0.0);
    }

}
