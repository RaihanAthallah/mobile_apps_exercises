package com.example.areacountapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText radiusInput, sisiInput, alasInput, tinggiInput, panjangInput, lebarInput;
    private Button lingkaranButton, persegiButton, segitigaButton, persegiPanjangButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize EditTexts
        radiusInput = findViewById(R.id.editTextText);
        sisiInput = findViewById(R.id.editTextText2);
        panjangInput = findViewById(R.id.editTextText3);
        lebarInput = findViewById(R.id.editTextText4);
        alasInput = findViewById(R.id.editTextText5);
        tinggiInput = findViewById(R.id.editTextText6);

        // Initialize Buttons
        lingkaranButton = findViewById(R.id.lingkaran);
        persegiButton = findViewById(R.id.persegi);
        segitigaButton = findViewById(R.id.segitiga);
        persegiPanjangButton = findViewById(R.id.persegi_panjang);

        // Set onClickListeners
        lingkaranButton.setOnClickListener(this::calculateCircleArea);
        persegiButton.setOnClickListener(this::calculateSquareArea);
        segitigaButton.setOnClickListener(this::calculateTriangleArea);
        persegiPanjangButton.setOnClickListener(this::calculateRectangleArea);
    }

    private void calculateCircleArea(View view) {
        String radiusStr = radiusInput.getText().toString();
        if (!radiusStr.isEmpty()) {
            double radius = Double.parseDouble(radiusStr);
            double area = Math.PI * Math.pow(radius, 2);
            Toast.makeText(this, "Circle area: " + area, Toast.LENGTH_SHORT).show();
        }
    }

    private void calculateSquareArea(View view) {
        String sisiStr = sisiInput.getText().toString();
        if (!sisiStr.isEmpty()) {
            double sisi = Double.parseDouble(sisiStr);
            double area = Math.pow(sisi, 2);
            Toast.makeText(this, "Square area: " + area, Toast.LENGTH_SHORT).show();
        }
    }

    private void calculateTriangleArea(View view) {
        String alasStr = alasInput.getText().toString();
        String tinggiStr = tinggiInput.getText().toString();
        if (!alasStr.isEmpty() && !tinggiStr.isEmpty()) {
            double alas = Double.parseDouble(alasStr);
            double tinggi = Double.parseDouble(tinggiStr);
            double area = 0.5 * alas * tinggi;
            Toast.makeText(this, "Triangle area: " + area, Toast.LENGTH_SHORT).show();
        }
    }

    private void calculateRectangleArea(View view) {
        String panjangStr = panjangInput.getText().toString();
        String lebarStr = lebarInput.getText().toString();
        if (!panjangStr.isEmpty() && !lebarStr.isEmpty()) {
            double panjang = Double.parseDouble(panjangStr);
            double lebar = Double.parseDouble(lebarStr);
            double area = panjang * lebar;
            Toast.makeText(this, "Rectangle area: " + area, Toast.LENGTH_SHORT).show();
        }
    }
}