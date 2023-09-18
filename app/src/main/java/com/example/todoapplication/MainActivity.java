package com.example.todoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private int HitCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button HitMeButton = findViewById(R.id.TestButton);
        if(HitMeButton == null)
            return;

        HitMeButton.setOnClickListener(CustomCallBack -> { HitTheButton(); });
    }

    private void HitTheButton()
    {
        HitCount = HitCount + 1;

        TextView TestText = findViewById(R.id.DisplayText);
        if(TestText == null)
            return;

        TestText.setText("클릭 한 횟수 : " + HitCount);
    }
}