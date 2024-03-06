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
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        editTextNumber1 = findViewById(R.id.editTextNumber1);
        editTextNumber2 = findViewById(R.id.editTextNumber2);
        resultTextView = findViewById(R.id.resultTextView);

        Button addButton = findViewById(R.id.add);
        addButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int num1 = Integer.parseInt(editTextNumber1.getText().toString());
                int num2 = Integer.parseInt(editTextNumber2.getText().toString());
                int sum = num1 + num2;

                // Display the result (You can modify this according to your requirement)
//                Toast.makeText(MainActivity.this, "Sum is: " + sum, Toast.LENGTH_SHORT).show();
                resultTextView.setText(""+sum);
            }
        });

        Button substractButton = findViewById(R.id.substract);
        substractButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int sum;
                int num1 = Integer.parseInt(editTextNumber1.getText().toString());
                int num2 = Integer.parseInt(editTextNumber2.getText().toString());
                if (num2 > num1) {
                    sum = num2 - num1;
                } else {
                    sum = num1 - num2;
                }

                // Display the result (You can modify this according to your requirement)
//                Toast.makeText(MainActivity.this, "Sum is: " + sum, Toast.LENGTH_SHORT).show();
                resultTextView.setText(""+sum);
            }
        });

        Button multiplyButton = findViewById(R.id.multiply);
        multiplyButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float sum;
                int num1 = Integer.parseInt(editTextNumber1.getText().toString());
                int num2 = Integer.parseInt(editTextNumber2.getText().toString());

                sum = num1 * num2;

                // Display the result (You can modify this according to your requirement)
//                Toast.makeText(MainActivity.this, "Sum is: " + sum, Toast.LENGTH_SHORT).show();
                resultTextView.setText(""+sum);
            }
        });

        Button divideButton = findViewById(R.id.divide);
        divideButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                float sum;
                float num1 = Float.parseFloat(editTextNumber1.getText().toString());
                float num2 = Float.parseFloat(editTextNumber2.getText().toString());

                sum = num1 / num2;

                // Display the result (You can modify this according to your requirement)
//                Toast.makeText(MainActivity.this, "Sum is: " + sum, Toast.LENGTH_SHORT).show();
                resultTextView.setText(""+sum);
            }
        });


//        @Override
//        protected void calculateNumbers(num1 int, num2 int){
//
//        }
    }




}