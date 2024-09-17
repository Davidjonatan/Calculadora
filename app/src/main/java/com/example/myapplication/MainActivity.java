package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView tvRes;
    float num1 = 0.0f;
    float num2= 0.0f;
    String operador = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tvRes = findViewById(R.id.tvRes);
    }

    public void writecero(View view) {
        if (tvRes.getText().toString().equals("0")){
            tvRes.setText("0");
        }else{
            tvRes.setText(tvRes.getText() + "0");
        }

    }

    public void writetree(View view) {
        if (tvRes.getText().toString().equals("0")){
            tvRes.setText("3");
        }else{
            tvRes.setText(tvRes.getText() + "3");
        }
    }

    public void writetwo(View view) {
        if (tvRes.getText().toString().equals("0")){
            tvRes.setText("2");
        }else{
            tvRes.setText(tvRes.getText() + "2");
        }
    }

    public void writeone(View view) {
        if (tvRes.getText().toString().equals("0")){
            tvRes.setText("1");
        }else{
            tvRes.setText(tvRes.getText() + "1");
        }
    }

    public void writesix(View view) {
        if (tvRes.getText().toString().equals("0")){
            tvRes.setText("6");
        }else{
            tvRes.setText(tvRes.getText() + "6");
        }
    }

    public void writefive(View view) {
        if (tvRes.getText().toString().equals("0")){
            tvRes.setText("5");
        }else{
            tvRes.setText(tvRes.getText() + "5");
        }
        }

    public void writefour(View view) {
        if (tvRes.getText().toString().equals("0")){
            tvRes.setText("4");
        }else{
            tvRes.setText(tvRes.getText() + "4");
        }
    }

    public void writenine(View view) {
        if (tvRes.getText().toString().equals("0")){
            tvRes.setText("9");
        }else{
            tvRes.setText(tvRes.getText() + "9");
        }
    }

    public void writeeight(View view) {
        if (tvRes.getText().toString().equals("0")){
            tvRes.setText("8");
        }else{
            tvRes.setText(tvRes.getText() + "8");
        }
    }

    public void writeseven(View view) {
        if (tvRes.getText().toString().equals("0")){
            tvRes.setText("7");
        }else{
            tvRes.setText(tvRes.getText() + "7");
        }
    }
    public void guardarnum1(View view) {
     num1 = Float.parseFloat(tvRes.getText().toString());
       tvRes.setText("0");
    }

    public void writediv(View view) {
        operador = "/";
        guardarnum1(view);
    }

    public void writemult(View view) {
        operador = "*";
        guardarnum1(view);
    }

    public void writerest(View view) {
        operador = "-";
        guardarnum1(view);
    }

    public void writesum(View view) {
        operador = "+";
        guardarnum1(view);
    }

    public void writeres(View view) {
        tvRes.setText("0");
        num1 = 0.0f;
        num2 = 0.0f;
        operador = "";

    }

    public void writesame(View view) {
        Float  result = 0.0f;
        num2 = Float.parseFloat(tvRes.getText().toString());
        //suma
        if(operador == "+"){
            result = num1 +num2;
            tvRes.setText(result.toString());
        }
        //rest
        else if (operador == "-") {
            result = num1-num2;
            tvRes.setText(result.toString());
        }
        //division
        else if (operador == "/") {
            result = num1/num2;
            tvRes.setText(result.toString());
        }
        //*
        else if (operador == "*") {
            result = num1*num2;
            tvRes.setText(result.toString());
        }



    }
}
