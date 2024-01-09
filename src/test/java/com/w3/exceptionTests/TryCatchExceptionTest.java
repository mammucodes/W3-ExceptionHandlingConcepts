package com.w3.exceptionTests;



import com.w3.exceptionhandling.Ass1TryCatch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TryCatchExceptionTest {

@Test
    public void divideNumberTest(){
    //int a=3, b=3;
    int a =3, b=0;
    Ass1TryCatch at = new Ass1TryCatch();
    try{
       int result = at.dividedNumber(a,b);
        System.out.println("result :"+result);
    }catch( ArithmeticException ae){
        System.out.println("Error: "+ae.getMessage());
    }
    // can test both ways Assertions.assert throws is given only in test class
    //whereas try catch is there for everyone who wants to use that class
    //not only for testing but also to run the required method
   // Assertions.assertThrows(ArithmeticException.class,()->at.dividedNumber(a,b));
}

}
