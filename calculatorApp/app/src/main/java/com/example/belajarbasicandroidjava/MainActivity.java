package com.example.belajarbasicandroidjava;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText editTextNumber1, editTextNumber2;
    TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        resultTextView = findViewById(R.id.resultTextView);

        findViewById(R.id.add).setOnClickListener(v -> performOperation('+'));
        findViewById(R.id.substract).setOnClickListener(v -> performOperation('-'));
        findViewById(R.id.multiply).setOnClickListener(v -> performOperation('*'));
        findViewById(R.id.divide).setOnClickListener(v -> performOperation('/'));
    }

    private void performOperation(char operator) {
        try {
            int num1 = Integer.parseInt(editTextNumber1.getText().toString());
            int num2 = Integer.parseInt(editTextNumber2.getText().toString());
            int result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        Toast.makeText(MainActivity.this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
                        return;
                    } else {
                        result = num1 / num2;
                    }
                    break;
            }
            resultTextView.setText(String.valueOf(result));
        } catch (NumberFormatException e) {
            Toast.makeText(MainActivity.this, "Invalid input", Toast.LENGTH_SHORT).show();
        }
    }
}