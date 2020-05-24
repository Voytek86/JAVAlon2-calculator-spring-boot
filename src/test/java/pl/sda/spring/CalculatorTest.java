package pl.sda.spring;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.sda.spring.exception.DivisionByZeroException;
import pl.sda.spring.operation.OperationType;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CalculatorTest {

    @Autowired
    private Calculator calculator;

    @Test
    public void shouldReturnFiveForGivenArgumentsOnAdditionOperation() {
        //given
        double arg1 = 2.0;
        double arg2 = 3.0;

        //when
        double actual = calculator.calculate(OperationType.ADDITION, arg1, arg2);

        //then
        Assert.assertEquals(5.0, actual, 0.00000001);
    }
    @Test
    public void subtraction() {
        //given
        double arg1 = 4.0;
        double arg2 = 3.0;

        //when
        double actual2 = calculator.calculate(OperationType.SUBTRACTION, arg1, arg2);

        //then
        Assert.assertEquals(1.0, actual2, 0.00000001);
    }
    @Test
    public void multiplication() {
        //given
        double arg1 = 4.0;
        double arg2 = 4.0;

        //when
        double actual3 = calculator.calculate(OperationType.MULTIPLICATION, arg1, arg2);

        //then
        Assert.assertEquals(16.0, actual3, 0.00000001);
    }

    @Test
    public void division() {
        //given
        double arg1 = 4.0;
        double arg2 = 2.0;

        //when
        double actual4 = calculator.calculate(OperationType.DIVISION, arg1, arg2);

        //then
        Assert.assertEquals(2.0, actual4, 0.00000001);
    }

    @Test(expected = DivisionByZeroException.class)
    public void divisionByZero() {
        //given
        double arg1 = 4.0;
        double arg2 = 0.0;

        //when
        double actual5 = calculator.calculate(OperationType.DIVISION, arg1, arg2);
    }

    @Test
    public void percentage() {
        //given
        double arg1 = 4.0;
        double arg2 = 80.0;

        //when
        double actual3 = calculator.calculate(OperationType.PERCENTAGE, arg1, arg2);

        //then
        Assert.assertEquals(3.2, actual3, 0.00000001);
    }

    @Test
    public void power() {
        //given
        double arg1 = 4.0;
        double arg2 = 2.0;

        //when
        double actual = calculator.calculate(OperationType.POWER, arg1, arg2);

        //then
        Assert.assertEquals(16, actual, 0.00000001);
    }
}
