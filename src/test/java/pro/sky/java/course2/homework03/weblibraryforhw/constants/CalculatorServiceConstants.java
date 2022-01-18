package pro.sky.java.course2.homework03.weblibraryforhw.constants;

public class CalculatorServiceConstants {
    public static final int NUM1_POSITIVE = 10;
    public static final int NUM2_POSITIVE = 2;
    public static final int NUM3_NEGATIVE = -10;
    public static final int ZERO = 0;
    public static final int SUM1_POSITIVE = NUM1_POSITIVE + NUM2_POSITIVE;
    public static final int SUM2_ZERO = NUM1_POSITIVE + NUM3_NEGATIVE;
    public static final int SUM3_NEGATIVE = NUM2_POSITIVE + NUM3_NEGATIVE;
    public static final int SUBTRACTION1_POSITIVE = NUM1_POSITIVE - NUM2_POSITIVE;
    public static final int SUBTRACTION2_NEGATIVE = NUM2_POSITIVE - NUM3_NEGATIVE;
    public static final int SUBTRACTION3_ZERO = NUM1_POSITIVE - NUM3_NEGATIVE;
    public static final int MULTIPLICATION1_POSITIVE = NUM1_POSITIVE * NUM2_POSITIVE;
    public static final int MULTIPLICATION2_NEGATIVE = NUM1_POSITIVE * NUM3_NEGATIVE;
    public static final int MULTIPLICATION3_ZERO = NUM1_POSITIVE * ZERO;
    public static final int DIVISION1_POSITIVE = NUM1_POSITIVE / NUM2_POSITIVE;
    public static final int DIVISION2_NEGATIVE = NUM1_POSITIVE / NUM3_NEGATIVE;
    public static final int DIVISION3_NEGATIVE = NUM3_NEGATIVE / NUM2_POSITIVE;
}
