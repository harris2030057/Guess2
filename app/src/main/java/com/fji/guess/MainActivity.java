package com.fji.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random ran = new Random();
    int i1 = ran.nextInt(9)+1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

public void guess(View view){

    EditText ednumber = (EditText) findViewById(R.id.ed_number);
    int i2 = Integer.parseInt(ednumber.getText().toString());


    if(i2<i1){
        new AlertDialog.Builder(this)
                .setMessage("小一點")
                .show();
    }else if (i2>i1){
        new AlertDialog.Builder(this)
                .setMessage("大一點")
                .show();
    } else {
        new AlertDialog.Builder(this)
                .setMessage("答對了")
                .show();
    }

}}


