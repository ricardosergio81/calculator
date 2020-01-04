package test.br.com.ricardorosa.calculator.operations;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class MyTestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestCalculate.class, TestCalculateString.class);

        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }

    }
}