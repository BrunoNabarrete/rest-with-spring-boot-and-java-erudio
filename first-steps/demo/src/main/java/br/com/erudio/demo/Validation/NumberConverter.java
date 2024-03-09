package br.com.erudio.demo.Validation;

public class NumberConverter {
    public static Double convertToDouble(String strNumber) {
        if (strNumber == null) return 0D;
        String number = strNumber.replaceAll(",", ".");
        //o intuito é que se passarmos um valor com virgula ou com ponto ele consiga faze o calculo.
        if (isNumeric(number)) return Double.parseDouble(number);
        return null;
    }

    public static boolean isNumeric(String strNumber) {

        if(strNumber == null) return false;
        String number = strNumber.replaceAll(",", ".");
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
