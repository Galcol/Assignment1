package com.example.myapplication;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button biggerBtn, equalBtn, smallerBtn, NumGenBtn;
    TextView resultTv, num1Tv, num2Tv;
    int num1, num2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        resultTv = findViewById(R.id.resultTv);
        num1Tv = findViewById(R.id.num1Tv);
        num2Tv = findViewById(R.id.num2Tv);

        biggerBtn = findViewById(R.id.biggerBtn);
        equalBtn = findViewById(R.id.equalBtn);
        smallerBtn = findViewById(R.id.smallerBtn);
        NumGenBtn = findViewById(R.id.NumGenBtn);

    }
    public void onClickGenNums(android.view.View NumGenBtn) {
        num1 = (int) Math.random()*101;
        num2 = (int) Math.random()*101;
        num1Tv.setText(""  + num1);
        num2Tv.setText(""  + num2);
    }
    public void onClickCheckSm(android.view.View smallerBtn) {
        resultTv.setText("" + (num1<num2));
    }
    public void onClickCheckEq(android.view.View equalBtn) {
        resultTv.setText("" + (num1==num2));
    }
    public void onClickCheckBg(android.view.View biggerBtn) {
        resultTv.setText("" + (num1>num2));
    }
}

