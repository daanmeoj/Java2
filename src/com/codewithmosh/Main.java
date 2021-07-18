package com.codewithmosh;

import com.codewithmosh.TextBox;
import com.codewithmosh.UIControl;
import com.codewithmosh.exceptions.Account;
import com.codewithmosh.exceptions.ExceptionsDemo;
import com.codewithmosh.exceptions.InsufficientFundsException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
     var account=new Account();
        try {
            account.withDraw(10);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

}
