package com.program.sonia_jayadi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnBurung,btnSinga, btnMonyet;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();
    }

    public void MyProfile (View v) {
        Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
        intent.putExtra("MAHASISWA", "Sonia Jayadi");
        startActivity(intent);
    }
    private void inisialisasiView() {
        btnBurung = findViewById(R.id.btn_buka_ras_burung);
        btnSinga = findViewById(R.id.btn_buka_ras_singa);
        btnMonyet = findViewById(R.id.btn_buka_ras_monyet);
        btnBurung.setOnClickListener(view -> bukaGaleri("Burung"));
        btnSinga.setOnClickListener(view -> bukaGaleri("Singa"));
        btnMonyet.setOnClickListener(view -> bukaGaleri("Monyet"));
    }

    private void bukaGaleri(String jenisHewan) {
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarHewanActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisHewan);
        startActivity(intent);
    }
}