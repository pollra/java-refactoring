package com.pollra.refactoring.removeif;

/**
 * @since       2021.08.27
 * @author      pollra
 * @description number
 **********************************************************************************************************************/
public class Number {
    private int no;

    public Number(int no) {
        this.no = no;
    }

    public Number calculate(String expression, Number number) {
        if ("+".equals(expression)) {
            return new Number(this.no + number.no);
        }

        if ("-".equals(expression)) {
            return new Number(this.no - number.no);
        }

        if ("*".equals(expression)) {
            return new Number(this.no * number.no);
        }

        if ("/".equals(expression)) {
            return new Number(this.no / number.no);
        }

        throw new IllegalArgumentException();
    }
}
