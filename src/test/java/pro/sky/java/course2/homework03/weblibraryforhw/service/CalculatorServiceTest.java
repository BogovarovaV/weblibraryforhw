package pro.sky.java.course2.homework03.weblibraryforhw.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorServiceTest {


        @Test
        public void shouldReturnCorrectSum1() {
            int result = 10 + 2;
            Assertions.assertEquals(12, result);
        }

        @Test
        public void shouldReturnCorrectSum2() {
          int result = 10 + (-10);
         Assertions.assertEquals(0, result);
        }

        @Test
        public void shouldReturnCorrectSubtraction1() {
            int result = 10 - 2;
            Assertions.assertEquals(8, result);
        }

        @Test
        public void shouldReturnCorrectSubtraction2() {
            int result = 10 - 10;
            Assertions.assertEquals(0, result);
        }

        @Test
        public void shouldReturnCorrectMultiplication1() {
            int result = 10 * 2;
            Assertions.assertEquals(20, result);
        }

        @Test
        public void shouldReturnCorrectMultiplication2() {
            int result = 10 * 0;
            Assertions.assertEquals(0, result);
        }

        @Test
        public void shouldReturnCorrectDivision1() {
            int result = 10 / 2;
            Assertions.assertEquals(5, result);
        }

        @Test
        public void shouldReturnCorrectDivision2() {
            int result = -10 / 2;
            Assertions.assertEquals(-5, result);
        }

        @Test
        public void shouldThrowIllegalArgumentExceptionIfDivisionByZero() {
            Assertions.assertThrows(IllegalArgumentException.class, ()-> division(10, 0), "You can't divide by zero!");
        }

        public int division(int num1, int num2) {
            if (num2 == 0) {
                throw new IllegalArgumentException();
            }
            return num1 / num2;
        }

}