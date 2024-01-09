package com.w3.exceptionhandling;

public class Exception_OddNumber {
    public void checkEvenNumber(int n){
        if(n%2!=0)
            throw  new IllegalArgumentException(n+" is odd");
    }

    public static void main(String[] args) {
        Exception_OddNumber ex = new Exception_OddNumber();
        int n =3;
        try {
            ex.checkEvenNumber(n);
            System.out.println(n+" is even");

        }catch(IllegalArgumentException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
