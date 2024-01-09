package com.w3.exceptionTests;

import com.w3.exceptionhandling.ReadFileException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExceptionTest {
    @Test
    public void  readFileTestWhenFileNotPresent(){
        String currDirUsingSystem = System.getProperty("user.dir");
      //  String currDir =  new File("").getAbsolutePath();
        String fileName = currDirUsingSystem + "\\abcEmpty.txt";
       // fileName = "abcEmpty.txt";
        File f = new File(fileName);
        ReadFileException rf = new ReadFileException();
        Assertions.assertThrows(FileNotFoundException.class,()->rf.readFile(f));






    }
@Test
    public void  readFileTestWhenFilePresent() throws FileNotFoundException {
        String currDirectory = System.getProperty("user.dir");
        String fileName = currDirectory+"\\abc.txt";
        File f = new File(fileName);
        ReadFileException rf = new ReadFileException();
  int excepted = 4;
  int result = rf.readFile(f);
 Assertions.assertEquals(excepted,result);

    }
    @Test
    public void readFilewithZeroLineFilePresent() throws FileNotFoundException {
        String currDir = System.getProperty("user.dir");
        String FileName = currDir+"//abcd.txt";
        File f= new File(FileName);
        int excepted = 0;
        ReadFileException rf = new ReadFileException();
          int result = rf.readFile(f);
          Assertions.assertEquals(excepted,result);
    }
}
