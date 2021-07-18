package com.codewithmosh.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show(){
        try(
                var reader=new FileReader("file.txt");
                var writer=new FileWriter("some file");
            ) {
            var value=reader.read();
        } catch (IOException e) {
            System.out.println("could not read data");
        }
    }


}
