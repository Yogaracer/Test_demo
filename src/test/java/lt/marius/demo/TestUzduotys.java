package lt.marius.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestUzduotys {

    //uzduotys is skaidres Automatinis testavimas
    //  4 yra lyginis skaičius


    @Test
    public void test01() {
        //1.duomenys
        int input = 4;
        int expectedReminder = 0;
        int actualReminder;

        //2 testavimo veiksmai

        actualReminder = input % 2;

        // 3 rezultatai

        Assert.assertEquals(actualReminder, expectedReminder);
    }

    //uzduotys is skaidres Automatinis testavimas
    // Dabar yra 19 valanda

    @Test
    public void test02() {
//1. duomenys
        int actualTime;
        int expectedTime = 19;

        //2. testavimo veiksmai

        actualTime = LocalTime.now().getHour();

//3. rezultatas
        Assert.assertTrue(actualTime == expectedTime,
                String.format("Actual: %s, Expected: %s", actualTime, expectedTime)
        );

    }
    //uzduotys is skaidres Automatinis testavimas
    // Testas “žalias” jeigu 995 dalijasi iš 3 (be liekanos)

    @Test
    public void testIf995CanBeDividedTo3WithoutResidue() {
        // 1. duomenys
        int number = 995;
        int expectedResult = 0;
        int actualResult;

        //2. testavimo veiksmai

        actualResult = number % 3;

        //3. rezultatas

        Assert.assertFalse(actualResult == expectedResult,
                String.format("Actual: %s, Expected: %s", actualResult, expectedResult)
        );


    }

    //uzduotys is skaidres Automatinis testavimas
    // Testas “žalias” jeigu šiandien trečiadienis

    @Test
    public void testIfDayIsWednesday() {

        String actualResult = String.valueOf(LocalDateTime.now().getDayOfWeek());
        String expectedResult = "Wednesday";
        Assert.assertEquals(actualResult, expectedResult);
    }
//uzduotys is skaidres Automatinis testavimas
//    Testas “žalias” jei nuo 1 iki 10 yra 4 lyginiai skaičiai

    @Test
    public void testIfRangeBetween1And10AreFourEvenValues() {

        int expectedResult = 4;
        int actualResult = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                actualResult++;
            }
        }
        Assert.assertEquals(actualResult, expectedResult);
    }

//uzduotys is skaidres Automatinis testavimas
//Testas “žalias” po to, kai “palaukia” 5 sekundes

@Test

    public void activateSleepFor5Seconds() {
try {
    System.out.println("Starting...");
    Thread.sleep(5000);
    System.out.println("FINALE");
    } catch (InterruptedException e) {
    e.printStackTrace();
    Thread.currentThread().interrupt();
    }

}
}
