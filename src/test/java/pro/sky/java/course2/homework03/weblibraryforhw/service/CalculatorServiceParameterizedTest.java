package pro.sky.java.course2.homework03.weblibraryforhw.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static pro.sky.java.course2.homework03.weblibraryforhw.constants.CalculatorServiceConstants.*;

public class CalculatorServiceParameterizedTest {

    public static Stream<Arguments> provideParamsForSumTest() {
        return Stream.of(Arguments.of(NUM1, NUM2, SUM));
    }

    public static Stream<Arguments> provideParamsForSubtractionTest() {
        return Stream.of(Arguments.of(NUM1, NUM2, SUBTRACTION));
    }

    public static Stream<Arguments> provideParamsForMultiplicationTest() {
        return Stream.of(Arguments.of(NUM1, NUM2, MULTIPLICATION));
    }

    public static Stream<Arguments> provideParamsForDivisionTest() {
        return Stream.of(Arguments.of(NUM1, NUM2, DIVISION));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSumTest")
    public void shouldReturnCorrectSumResult(int num1, int num2, int sumResult) {
        int result = num1 + num2;
        Assertions.assertEquals(sumResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSubtractionTest")
    public void shouldReturnCorrectSubtractionResult(int num1, int num2, int subtractionResult) {
        int result = num1 - num2;
        Assertions.assertEquals(subtractionResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplicationTest")
    public void shouldReturnCorrectMultiplicationResult(int num1, int num2, int multiplicationResult) {
        int result = num1 * num2;
        Assertions.assertEquals(multiplicationResult, result);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivisionTest")
    public void shouldReturnCorrectDivisionResult(int num1, int num2, int divisionResult) {
        int result = num1 / num2;
        Assertions.assertEquals(divisionResult, result);
    }


}
