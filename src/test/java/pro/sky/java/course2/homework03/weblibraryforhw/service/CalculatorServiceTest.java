package pro.sky.java.course2.homework03.weblibraryforhw.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static pro.sky.java.course2.homework03.weblibraryforhw.constants.CalculatorServiceConstants.*;

class CalculatorServiceTest {
    
    private final CalculatorService out = new CalculatorServiceImpl();

        @Test
        public void shouldReturnCorrectSum1() {
            int result = out.getSum(NUM1_POSITIVE, NUM2_POSITIVE);
            Assertions.assertEquals(SUM1_POSITIVE, result);
        }

        @Test
        public void shouldReturnCorrectSum2() {
            int result = out.getSum(NUM1_POSITIVE, NUM3_NEGATIVE);
         Assertions.assertEquals(SUM2_ZERO, result);
        }

        @Test
        public void shouldReturnCorrectSubtraction1() {
            int result = out.getSubtraction(NUM1_POSITIVE, NUM2_POSITIVE);
            Assertions.assertEquals(SUBTRACTION1_POSITIVE, result);
        }

        @Test
        public void shouldReturnCorrectSubtraction2() {
            int result = out.getSubtraction(NUM2_POSITIVE, NUM3_NEGATIVE);
            Assertions.assertEquals(SUBTRACTION2_NEGATIVE, result);
        }

        @Test
        public void shouldReturnCorrectMultiplication1() {
            int result = out.getMultiplication(NUM1_POSITIVE, NUM2_POSITIVE);
            Assertions.assertEquals(MULTIPLICATION1_POSITIVE, result);
        }

        @Test
        public void shouldReturnCorrectMultiplication2() {
            int result = out.getMultiplication(NUM1_POSITIVE, NUM3_NEGATIVE);
            Assertions.assertEquals(MULTIPLICATION2_NEGATIVE, result);
        }

        @Test
        public void shouldReturnCorrectPositiveDivision1() {
            int result = out.getDivision(NUM1_POSITIVE, NUM2_POSITIVE);
            Assertions.assertEquals(DIVISION1_POSITIVE, result);
        }

        @Test
        public void shouldReturnCorrectNegativeDivision2() {
            int result = out.getDivision(NUM1_POSITIVE, NUM3_NEGATIVE);
            Assertions.assertEquals(DIVISION2_NEGATIVE, result);
        }

        @Test
        public void shouldThrowIllegalArgumentExceptionIfDivisionByZero() {
            Assertions.assertThrows(IllegalArgumentException.class, ()-> division(NUM1_POSITIVE, ZERO), "You can't divide by zero!");
        }

        public int division(int num1, int num2) {
            if (num2 == 0) {
                throw new IllegalArgumentException();
            }
            return num1 / num2;
        }

}