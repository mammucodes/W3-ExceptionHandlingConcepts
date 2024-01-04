package com.w3.exceptionhandling;

public class Ass1TryCatch {
    public static int dividedNumber(int dividend, int divisor) {
        if (divisor == 0){
            throw new ArithmeticException("Cannot divide the given number by zero ");
        }

        return 0;
    }


    public static void main(String[] args) {
try {
    int result = Ass1TryCatch.dividedNumber(2, 0);
    System.out.println("result " + result);
}
catch(ArithmeticException ae) {
    System.out.println("Error :" + ae.getMessage());
}
    }
}



