package com.projeto.projeto;

import org.springframework.web.bind.annotation.RestController;

import com.projeto.projeto.exception.UnsupportedMathOperationException;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class MathController {
    
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}",method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne,@PathVariable(value="numberTwo")String numberTwo) throws Exception{
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return convertNumber(numberOne)+convertNumber(numberTwo);
    }
    @RequestMapping(value = "/div/{numberOne}/{numberTwo}",method=RequestMethod.GET)
    public Double div(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return convertNumber(numberOne)/convertNumber(numberTwo);
    }
    
    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}",method=RequestMethod.GET)
    public Double sub(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return convertNumber(numberOne)-convertNumber(numberTwo);
    }
    
    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}",method=RequestMethod.GET)
    public Double mult(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        if(!isNumeric(numberOne) || !isNumeric(numberTwo)){
            throw new UnsupportedMathOperationException("Please set a numeric value");
        }
        return convertNumber(numberOne)*convertNumber(numberTwo);
    }

    private Double convertNumber(String strNumber) {
        if (strNumber == null) return 0D;
        String number = strNumber.replace(",",".");
        if(isNumeric(number)) return Double.parseDouble(number);
        return 0D;
    }

    private boolean isNumeric(String strNumber) {
        if(strNumber==null) return false;
        String number = strNumber.replace(",", ".");
        return number.matches("[+-]?[0-9]*\\.?[0-9]+");
    }
    
}
