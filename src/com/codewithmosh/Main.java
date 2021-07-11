package com.codewithmosh;

import com.codewithmosh.TextBox;
import com.codewithmosh.UIControl;

public class Main {

    public static void main(String[] args) {
        UIControl [] controls={new TextBox(),new CheckBox()};
        for(var control:controls){
            control.render();
        }
    }

}
