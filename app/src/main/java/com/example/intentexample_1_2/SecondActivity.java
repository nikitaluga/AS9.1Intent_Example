package com.example.intentexample_1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        editText = findViewById(R.id.editText);
    }

    public void onOpenThirdActivity(View view) {
        if (editText.getText().toString().equals("")){
            Toast.makeText(this,"Введите цифры !", Toast.LENGTH_LONG).show();
        }else {
            Intent thirdActivityIntent = new Intent(this,ThirdActivity.class);
            String editTextMassage = editText.getText().toString();
            thirdActivityIntent.putExtra("toSecondActivity",editTextMassage);
            startActivity(thirdActivityIntent);
        }

    }
}
