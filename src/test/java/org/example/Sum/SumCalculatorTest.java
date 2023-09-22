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
        Assertions.assertEquals(1, sumObj.sum(1));
    }

    @Test
    void testSumSecond() {
        Assertions.assertEquals(6, sumObj.sum(3));
    }

    @Test
    void testSumThird() {
        Assertions.assertThrows(ValidationException.class,
                () -> sumObj.sum(0));
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Done Tests");
    }
}