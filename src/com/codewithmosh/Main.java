package com.codewithmosh;

import com.codewithmosh.TextBox;
import com.codewithmosh.UIControl;

public class Main {

    public static void main(String[] args) {
        var control=new UIControl(true);
        var textBox=new TextBox();
        show(control);
        //show(textBox);
    }

    public static void show(UIControl control){
        if(control instanceof TextBox){
            var textBox=(TextBox)control;
            textBox.setText("hello");
        }

        System.out.println(control);
    }

}
