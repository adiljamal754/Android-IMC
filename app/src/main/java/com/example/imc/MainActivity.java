package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Calculate(View view){

        EditText weight = findViewById(R.id.weightET);
        EditText height = findViewById(R.id.heightET);
        TextView result = findViewById(R.id.resultTV);

        double w = Double.parseDouble(weight.getText().toString());
        double h = Double.parseDouble(height.getText().toString());

        double imc = w / Math.pow(h,2);

        if(imc < 18.5){
            result.setText("Está a baixo do peso!");
        }else if(imc >= 18.5 && imc <= 24.9){
            result.setText("Normal!");
        }else if(imc >= 25 && imc <= 29.9){
            result.setText("Pré-obeso!! Cuide-se!");
        }else if(imc >= 30 && imc <= 34.9){
            result.setText("Obeso I!");
        }else if(imc >= 35 && imc <= 39.9){
            result.setText("Obeso II!");
        }else{
            result.setText("Obeso III");
        }



    }
}