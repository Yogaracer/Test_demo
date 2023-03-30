package lt.marius.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo {
    @Test
    public void testIfNumberIsEven_InputValueIs10() {
        // 1. dalis. duomenys
        int input = 10;
        int expctedReminder = 0;
        int actualReminder;

// 2. testavimo veiksmai
        actualReminder = input % 2;

// 3. dalis. testavimo rezultatu patikrinimas
        Assert.assertEquals(actualReminder, expctedReminder);

    }

    @Test
    public void testWithAssertTrueIfNumberIsNotEven_InputNumberIs9() {
        int input = 9;
        int expctedReminder = 0;
        int actualReminder;

// 2. testavimo veiksmai
        actualReminder = input % 2;

// 3. dalis. testavimo rezultatu patikrinimas
        Assert.assertFalse(
                actualReminder == expctedReminder,
                String.format("Actual: %s, Expected: %s", actualReminder, expctedReminder)
        );

    }

    @Test
    public void testWithAssertFalseIfNumberIsNotEven_InputValueIs9() {
        int input = 9;
        int expctedReminder = 0;
        int actualReminder;

// 2. testavimo veiksmai
        actualReminder = input % 2;

// 3. dalis. testavimo rezultatu patikrinimas
        Assert.assertTrue(
                actualReminder == expctedReminder,
                String.format("Actual: %s, Expected: %s", actualReminder, expctedReminder)
        );
    }

    @Test
    public void testIfSumIsCorrect_InputValuesAre5And6() {
        //1. duomenys
        int inputA = 5;
        int inputB = 6;
        int expectedResult = 11;
        int actualResult;

        //2.veiksmai
        actualResult = inputA + inputB;

        //3. testo rezultatas
        //  Assert.assertEquals(actualResult, expectedResult);
        Assert.assertTrue(actualResult == expectedResult);
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult);
    }
}
