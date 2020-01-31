package com.example.intentexample_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Intent gettingIntent = getIntent();
        String getTextFromSecondActivity = gettingIntent.getStringExtra("toSecondActivity");
        TextView textView = findViewById(R.id.newTextView);
        int number = Integer.parseInt(getTextFromSecondActivity);

        if (number > 100) {
            textView.setText("Your number so big");
        }
        if (number < 100) {
            textView.setText("Your number so small");
        }
        if (number == 100){
            textView.setText("My congratulations!");
        }
        if (getTextFromSecondActivity.equals("")){
            textView.setText("Введите число !");
        }
    }
}
