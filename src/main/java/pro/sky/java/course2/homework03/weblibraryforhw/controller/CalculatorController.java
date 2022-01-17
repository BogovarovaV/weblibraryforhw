package pro.sky.java.course2.homework03.weblibraryforhw.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.homework03.weblibraryforhw.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String showGreetings(){
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String showSum(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.getSum(num1, num2);
    }

    @GetMapping("/minus")
    public String showSubtraction(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.getSubtraction(num1, num2);
    }

    @GetMapping("/multiply")
    public String showMultiplication(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.getMultiplication(num1, num2);
    }

    @GetMapping("/divide")
    public String showDivision(@RequestParam int num1, @RequestParam int num2) {
            return num1 + " / " + num2 + " = " + calculatorService.getDivision(num1, num2);
    }

}
