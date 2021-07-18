package com.codewithmosh;

import com.codewithmosh.TextBox;
import com.codewithmosh.UIControl;
import com.codewithmosh.exceptions.ExceptionsDemo;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (Throwable e) {
            System.out.println("unexpected error occurred");
        }
    }

}
