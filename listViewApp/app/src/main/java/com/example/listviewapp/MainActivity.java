package com.example.listviewapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ListView lv;
    private ArrayAdapter<String> kontak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.listview);
        String[] nama = new String[] {"agus","budi","cica","dani",
                "eka","fani","gina","hadi","indah",
                "jono","kana","Lina","Maya","Nanik","Opi"};
        ArrayList<String> listNama = new ArrayList<>();
        listNama.addAll(Arrays.asList(nama));
        kontak =  new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listNama);
        lv.setAdapter(kontak);
    }
}
