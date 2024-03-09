package br.com.erudio.demo.Controller;

import br.com.erudio.demo.Validation.NumberConverter;
import br.com.erudio.demo.exceptions.UnsupportedMathOperationException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareRootController {

    @RequestMapping(value="/squareRoot/{number}", method= RequestMethod.GET)
    public Double squareRoot(@PathVariable("number") String number) throws Exception {
        if(!NumberConverter.isNumeric(number)) {
            throw new UnsupportedMathOperationException("Please set a numeric value!");
        }
        return (Double) Math.sqrt(NumberConverter.convertToDouble(number));
    }
}
