package com.w3.exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileException {

    //this method takes File as input and returns the number of lines in the file
    //throws FileNotFoundException if the file is not found
    public int readFile(File file) throws FileNotFoundException {
        //   File f ;//= new File(file);
//        if(file != null )
        Scanner sc = new Scanner(file); // scanner class throw checked exception of file not found exception. so, no need to try try cathc

        //if (!file.exists() || file.isDirectory())
        //if (!f.canRead()) {
        //throw new FileNotFoundException();
        // }
        // else {
        int cntr = 0;
        while (sc.hasNextLine()) { //
            String line = sc.nextLine();
            cntr++;
        }
        sc.close();
        return cntr;
    }

    // }

    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "C:\\Users\\91779\\Downloads\\abc.txt";
        File f = new File(fileName);
        ReadFileException rf = new ReadFileException();


        rf.readFile(f);

//        try {
//            rf.readFile(fileName);
//
//        } catch (FileNotFoundException fe) {
//            System.out.println("Error:" + fe.getMessage());
//        }
    }
}
