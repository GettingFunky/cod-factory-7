package gr.codeWars.java;

public class IntegralOfExpression {

    public static String integrate(int coefficient, int exponent) {
        int newExp = exponent + 1;
        return ((coefficient/newExp) + "x^" + (exponent + 1));
    }


}
