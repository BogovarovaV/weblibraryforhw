package pro.sky.java.course2.homework03.weblibraryforhw.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static pro.sky.java.course2.homework03.weblibraryforhw.constants.CalculatorServiceConstants.*;

class CalculatorServiceTest {
    
    private final CalculatorService out = new CalculatorServiceImpl();

        @Test
        public void shouldReturnCorrectSum1() {
            int result = out.getSum(NUM1, NUM2);
            Assertions.assertEquals(SUM1, result);
        }

        @Test
        public void shouldReturnCorrectSum2() {
            int result = out.getSum(NUM1, NUM3);
         Assertions.assertEquals(SUM2, result);
        }

        @Test
        public void shouldReturnCorrectSubtraction1() {
            int result = out.getSubtraction(NUM1, NUM2);
            Assertions.assertEquals(SUBTRACTION1, result);
        }

        @Test
        public void shouldReturnCorrectSubtraction2() {
            int result = out.getSubtraction(NUM2, NUM3);
            Assertions.assertEquals(SUBTRACTION2, result);
        }

        @Test
        public void shouldReturnCorrectMultiplication1() {
            int result = out.getMultiplication(NUM1, NUM2);
            Assertions.assertEquals(MULTIPLICATION1, result);
        }

        @Test
        public void shouldReturnCorrectMultiplication2() {
            int result = out.getMultiplication(NUM1, NUM3);
            Assertions.assertEquals(MULTIPLICATION2, result);
        }

        @Test
        public void shouldReturnCorrectDivision1() {
            int result = out.getDivision(NUM1, NUM2);
            Assertions.assertEquals(DIVISION1, result);
        }

        @Test
        public void shouldReturnCorrectDivision2() {
            int result = out.getDivision(NUM1, NUM3);
            Assertions.assertEquals(DIVISION2, result);
        }

        @Test
        public void shouldThrowIllegalArgumentExceptionIfDivisionByZero() {
            Assertions.assertThrows(IllegalArgumentException.class, ()-> division(NUM1, NUM4), "You can't divide by zero!");
        }

        public int division(int num1, int num2) {
            if (num2 == 0) {
                throw new IllegalArgumentException();
            }
            return num1 / num2;
        }

}