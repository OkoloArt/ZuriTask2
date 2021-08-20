package com.example.zuritask2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView displayTv;
    EditText userInput;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayTv = findViewById(R.id.display_tv);
        userInput = findViewById(R.id.userInput);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = userInput.getText().toString();
                displayTv.setText(text);
            }
        });

    }

    private void printName() {

        String name = "Okolo Arthur";
        System.out.println("My name is" + name);
    }
}