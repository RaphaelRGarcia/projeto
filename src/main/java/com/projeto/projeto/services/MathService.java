package com.projeto.projeto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.projeto.exception.UnsupportedMathOperationException;
import com.projeto.projeto.tools.MathTools;

@Service
public class MathService {
    
    @Autowired
    private MathTools mathTools;

    public Double sum(String numberOne,String numberTwo) throws Exception{
        if (!mathTools.isNumeric(numberOne) || !mathTools.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return mathTools.convertNumber(numberOne)+mathTools.convertNumber(numberTwo);
    }

    public Double div(String numberOne,String numberTwo) {
        if(!mathTools.isNumeric(numberOne) || !mathTools.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return mathTools.convertNumber(numberOne)/mathTools.convertNumber(numberTwo);
    }
    
    public Double sub(String numberOne, String numberTwo) {
        if(!mathTools.isNumeric(numberOne) || !mathTools.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return mathTools.convertNumber(numberOne)-mathTools.convertNumber(numberTwo);
    }
    
    public Double mult(String numberOne,String numberTwo) {
        if(!mathTools.isNumeric(numberOne) || !mathTools.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return mathTools.convertNumber(numberOne)*mathTools.convertNumber(numberTwo);
    }
    
    public Double avg(String numberOne,String numberTwo) {
        if(!mathTools.isNumeric(numberOne) || !mathTools.isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return (mathTools.convertNumber(numberOne)+mathTools.convertNumber(numberTwo))/2;
    }
    
    public Double sqrt(String number) {
        if(!mathTools.isNumeric(number)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return Math.sqrt(mathTools.convertNumber(number));
    }

}
