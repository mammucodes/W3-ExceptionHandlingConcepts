package com.w3.exceptionTests;

import com.w3.exceptionhandling.Exception_OddNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class Exception_OddNumberTest {
@Test
    public void checkEvenNumberTest(){
    int n =3;
    Exception_OddNumber ex = new Exception_OddNumber();
    try{
        ex.checkEvenNumber(n);
        System.out.println(n+" is even");
    }
    catch(IllegalArgumentException e){
        System.out.println("Error :"+e.getMessage());
    }

}
@Test
public void checkEvenNumberTest2Fail(){
    int n =3;
    Exception_OddNumber ex = new Exception_OddNumber();
    Assertions.assertThrows( IllegalArgumentException.class,()->ex.checkEvenNumber(n));
}

}
