package org.example.Sum;

import org.junit.jupiter.api.*;

import javax.validation.ValidationException;


class SumCalculatorTest {

    public SumCalculator sumObj;

    @BeforeEach
    void setUp() {
        sumObj = new SumCalculator();
    }

    @Test
    void testSumFirst() {
        int actual = sumObj.sum(1);
        int exp = 1;

        Assertions.assertEquals(exp, actual);
    }

    @Test
    void testSumSecond() {
        int actual = sumObj.sum(3);
        int exp = 6;

        Assertions.assertEquals(exp, actual);
    }

    @Test
    void testSumThird() {
        SumCalculator sumCalculator = new SumCalculator();
        Assertions.assertThrows(ValidationException.class,
                () -> sumCalculator.sum(0));
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Done Tests");
    }
}