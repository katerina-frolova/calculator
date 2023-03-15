package pro.sky.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public int sum(int num1, int num2){
        return num1+num2;
    }
    public int minus (int num1, int num2){
        return num1-num2;
    }
    public int mult (int num1, int num2){
        return num1*num2;
    }
    public int divide (int num1, int num2){
        return num1/num2;
    }
}
