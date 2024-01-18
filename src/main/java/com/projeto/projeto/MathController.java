package com.projeto.projeto;

import org.springframework.web.bind.annotation.RestController;

import com.projeto.projeto.services.MathService;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class MathController {
    
    private final AtomicLong counter = new AtomicLong();
    private final MathService mathService = new MathService();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}",method = RequestMethod.GET)
    public Double sum(@PathVariable(value = "numberOne") String numberOne,@PathVariable(value="numberTwo")String numberTwo) throws Exception{
        return mathService.sum(numberOne, numberTwo);
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}",method=RequestMethod.GET)
    public Double div(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        return mathService.div(numberOne, numberTwo);
    }
    
    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}",method=RequestMethod.GET)
    public Double sub(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        return mathService.sub(numberOne, numberTwo);
    }
    
    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}",method=RequestMethod.GET)
    public Double mult(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        return mathService.mult(numberOne, numberTwo);
    }
    
    @RequestMapping(value = "/avg/{numberOne}/{numberTwo}",method=RequestMethod.GET)
    public Double avg(@PathVariable(value = "numberOne") String numberOne, @PathVariable(value = "numberTwo") String numberTwo) {
        return mathService.avg(numberOne, numberTwo);
    }
    
    @RequestMapping(value = "/sqrt/{number}",method=RequestMethod.GET)
    public Double sqrt(@PathVariable(value = "number") String number) {
        return mathService.sqrt(number);
    }
    
}
