package br.com.erudio.demo.Controller;

import br.com.erudio.demo.Validation.NumberConverter;
import br.com.erudio.demo.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DivisionController {

    @RequestMapping(value="/division/{numberOne}/{numberTwo}", method= RequestMethod.GET)
    public Double division(@PathVariable("numberOne") String numberOne,
                           @PathVariable("numberTwo") String numberTwo) throws Exception {
        if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        if(NumberConverter.convertToDouble(numberTwo) == 0) {
            throw new UnsupportedMathOperationException("Division by zero is not allowed!");
        }
        return NumberConverter.convertToDouble(numberOne) / NumberConverter.convertToDouble(numberTwo);
    }
}
