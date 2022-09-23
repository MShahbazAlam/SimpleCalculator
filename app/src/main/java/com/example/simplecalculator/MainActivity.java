package com.example.simplecalculator;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    @SuppressLint("SetTextI18n")
    public void Add(View v){
        EditText et1 = findViewById(R.id.editTextNumber);
        EditText et2 = findViewById(R.id.editTextNumber2);
        EditText et3 = findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 +n2 ;

        et3.setText("Total Value : " + result);
    }
    @SuppressLint("SetTextI18n")
    public void Subtraction(View v){
        EditText et1 = findViewById(R.id.editTextNumber);
        EditText et2 = findViewById(R.id.editTextNumber2);
        EditText et3 = findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 - n2 ;

        et3.setText("Total Value : " + result);
    }
    @SuppressLint("SetTextI18n")
    public void Mutiplication(View v){
        EditText et1 = findViewById(R.id.editTextNumber);
        EditText et2 = findViewById(R.id.editTextNumber2);
        EditText et3 = findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 * n2 ;

        et3.setText("Total Value : " + result);
    }
    @SuppressLint("SetTextI18n")
    public void Divide(View v){
        EditText et1 = findViewById(R.id.editTextNumber);
        EditText et2 = findViewById(R.id.editTextNumber2);
        EditText et3 = findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 / n2 ;

        et3.setText("Total Value : " + result);


    }
}