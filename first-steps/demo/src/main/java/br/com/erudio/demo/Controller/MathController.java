package br.com.erudio.demo.Controller;

import br.com.erudio.demo.Validation.NumberConverter;
import br.com.erudio.demo.exceptions.UnsupportedMathOperationException;
import br.com.erudio.demo.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class MathController {

    @Autowired
    private PersonServices services;
    @RequestMapping(value="/sum/{numberOne}/{numberTwo}", method=RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne,
                      @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
            }
        return (NumberConverter.convertToDouble(numberOne)) + NumberConverter.convertToDouble(numberTwo);
    }

}