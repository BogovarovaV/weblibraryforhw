package pro.sky.java.course2.homework03.weblibraryforhw.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static pro.sky.java.course2.homework03.weblibraryforhw.constants.CalculatorServiceConstants.*;

public class CalculatorServiceParameterizedTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    public static Stream<Arguments> provideParamsForSumTest() {
        return Stream.of(Arguments.of(NUM1, NUM2, SUM1),
                        Arguments.of(NUM1, NUM3, SUM2),
                        Arguments.of(NUM2, NUM3, SUM3));
    }

    public static Stream<Arguments> provideParamsForSubtractionTest() {
        return Stream.of(Arguments.of(NUM1, NUM2, SUBTRACTION1),
                        Arguments.of(NUM2, NUM3, SUBTRACTION2),
                        Arguments.of(NUM1, NUM3, SUBTRACTION3));
    }

    public static Stream<Arguments> provideParamsForMultiplicationTest() {
        return Stream.of(Arguments.of(NUM1, NUM2, MULTIPLICATION1),
                        Arguments.of(NUM1, NUM3, MULTIPLICATION2),
                        Arguments.of(NUM1, NUM4, MULTIPLICATION3));
    }

    public static Stream<Arguments> provideParamsForDivisionTest() {
        return Stream.of(Arguments.of(NUM1, NUM2, DIVISION1),
                        Arguments.of(NUM1, NUM3, DIVISION2),
                        Arguments.of(NUM3, NUM2, DIVISION3));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSumTest")
    public void shouldReturnCorrectSumResult(int num1, int num2, int sumResult) {
        int result = out.getSum(num1, num2);
        Assertions.assertEquals(sumResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubtractionTest")
    public void shouldReturnCorrectSubtractionResult(int num1, int num2, int subtractionResult) {
        int result = out.getSubtraction(num1, num2);
        Assertions.assertEquals(subtractionResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplicationTest")
    public void shouldReturnCorrectMultiplicationResult(int num1, int num2, int multiplicationResult) {
        int result = out.getMultiplication(num1, num2);
        Assertions.assertEquals(multiplicationResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivisionTest")
    public void shouldReturnCorrectDivisionResult(int num1, int num2, int divisionResult) {
        int result = out.getDivision(num1, num2);
        Assertions.assertEquals(divisionResult, result);
    }

}
