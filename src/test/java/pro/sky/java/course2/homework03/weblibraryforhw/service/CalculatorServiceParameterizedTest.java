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
        return Stream.of(Arguments.of(NUM1_POSITIVE, NUM2_POSITIVE, SUM1_POSITIVE),
                        Arguments.of(NUM1_POSITIVE, NUM3_NEGATIVE, SUM2_ZERO),
                        Arguments.of(NUM2_POSITIVE, NUM3_NEGATIVE, SUM3_NEGATIVE));
    }

    public static Stream<Arguments> provideParamsForSubtractionTest() {
        return Stream.of(Arguments.of(NUM1_POSITIVE, NUM2_POSITIVE, SUBTRACTION1_POSITIVE),
                        Arguments.of(NUM2_POSITIVE, NUM3_NEGATIVE, SUBTRACTION2_NEGATIVE),
                        Arguments.of(NUM1_POSITIVE, NUM3_NEGATIVE, SUBTRACTION3_ZERO));
    }

    public static Stream<Arguments> provideParamsForMultiplicationTest() {
        return Stream.of(Arguments.of(NUM1_POSITIVE, NUM2_POSITIVE, MULTIPLICATION1_POSITIVE),
                        Arguments.of(NUM1_POSITIVE, NUM3_NEGATIVE, MULTIPLICATION2_NEGATIVE),
                        Arguments.of(NUM1_POSITIVE, ZERO, MULTIPLICATION3_ZERO));
    }

    public static Stream<Arguments> provideParamsForDivisionTest() {
        return Stream.of(Arguments.of(NUM1_POSITIVE, NUM2_POSITIVE, DIVISION1_POSITIVE),
                        Arguments.of(NUM1_POSITIVE, NUM3_NEGATIVE, DIVISION2_NEGATIVE),
                        Arguments.of(NUM3_NEGATIVE, NUM2_POSITIVE, DIVISION3_NEGATIVE));
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
