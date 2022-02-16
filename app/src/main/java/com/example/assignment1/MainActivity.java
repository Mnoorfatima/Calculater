package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public String str="";
    Character operator ='q';
    int  i;
    double num;
    int numtemp;
    EditText showresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showresult=(EditText) findViewById(R.id.result_id);
    }
    private  void insert(int j )
    {
        str = str+ Integer.toString(j);
        num = Double.valueOf(str).doubleValue();
        showresult.setText(str);
    }
    private void reset()
    {
        str="";
        operator='q';
        num=0;
        numtemp=0;
        showresult.setText("");
    }
    private void perform()
    {
        str="";
        numtemp = (int) num;
    }
    private  void calculate ()
    {
        if (operator == '+') {
            num = numtemp + num;
        } else if (operator == '-') {
            num = numtemp - num;
        } else if (operator == '*') {
            num = numtemp * num;
        }else if (operator == '/') {
            num = numtemp / num;
        }
        showresult.setText(""+num);
    }

    public void btn7Clicked(View view) {
        insert(7);
    }

    public void btn8Clicked(View view) {
        insert(8);
    }

    public void btn9Clicked(View view) {
        insert(9);
    }

    public void btnclearClicked(View view) {
        reset();
    }

    public void btn4Clicked(View view) {
        insert(4);
    }

    public void btn5Clicked(View view) {
        insert(5);
    }

    public void btn6Clicked(View view) {
        insert(6);
    }

    public void btnplusClicked(View view) {
        perform();
        operator='+';
    }

    public void btn1Clicked(View view) {
        insert(1);
    }

    public void btn2Clicked(View view) {
        insert(2);
    }

    public void btn3Clicked(View view) {
        insert(3);
    }

    public void btnminusClicked(View view) {
        perform();
        operator='-';
    }

    public void btnequalClicked(View view) {
        perform();
        operator='*';
    }

    public void btndivideClicked(View view) {
        perform();
        operator='/';
    }

    public void btnmultiClicked(View view) {
        insert(0);
    }

    public void btn0Clicked(View view) {
    }
}