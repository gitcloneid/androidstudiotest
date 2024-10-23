package com.example.havid;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        Button strukturKelas = findViewById(R.id.button5);
        Button kembali = findViewById(R.id.button6);
        Button jadwalPelajaran = findViewById(R.id.button3);
        Button kbm = findViewById(R.id.button2);
        Button piket = findViewById(R.id.button4);

        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // kode untuk menghandle klik tombol dan mengarah ke activity lain
                Intent intent = new Intent(Menu.this, MainActivity.class);
                startActivity(intent);
            }
        });

        jadwalPelajaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // kode untuk menghandle klik tombol dan mengarah ke activity lain
                Intent intent = new Intent(Menu.this, JadwalPelajaran.class);
                startActivity(intent);
            }
        });

        strukturKelas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // kode untuk menghandle klik tombol dan mengarah ke activity lain
                Intent intent = new Intent(Menu.this, StrukturKelas.class);
                startActivity(intent);
            }
        });

        kbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // kode untuk menghandle klik tombol dan mengarah ke activity lain
                Intent intent = new Intent(Menu.this, Kbm.class);
                startActivity(intent);
            }
        });

        piket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // kode untuk menghandle klik tombol dan mengarah ke activity lain
                Intent intent = new Intent(Menu.this, Piket.class);
                startActivity(intent);
            }
        });
    }
}