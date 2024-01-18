package com.projeto.projeto.services;

import com.projeto.projeto.exception.UnsupportedMathOperationException;
import com.projeto.projeto.tools.MathTools;

public class MathService {
    
    private final MathTools mathTools;


    public MathService() {
        this.mathTools = new MathTools();
    }


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
