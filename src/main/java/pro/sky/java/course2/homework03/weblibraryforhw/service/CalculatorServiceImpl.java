package pro.sky.java.course2.homework03.weblibraryforhw.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public int getSum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int getSubtraction(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int getMultiplication(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int getDivision(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return num1 / num2;
    }
}
