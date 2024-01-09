package com.w3.exceptionhandling;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

    public class PositiveNumberChecker {
        public static void main(String[] args) {
            try {
                String currDir = System.getProperty("user.dir");
                String fileName = currDir + "\\abcd.txt";

                checkForPositiveNumbers(fileName);
                System.out.println("All numbers are non-positive.");
            } catch (PositiveNumberException e) {
                System.err.println("Exception: " + e.getMessage());
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
            }
        }

        public static void checkForPositiveNumbers(String filename) throws IOException, PositiveNumberException {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                int number = Integer.parseInt(line);
                if (number > 0) {
                   // bufferedReader.close();
                    throw new PositiveNumberException("Positive number found: " + number);
                }
            }

            bufferedReader.close();
        }
    }

   class PositiveNumberException extends Exception {
        public PositiveNumberException(String message) {
            super(message);
        }
    }


