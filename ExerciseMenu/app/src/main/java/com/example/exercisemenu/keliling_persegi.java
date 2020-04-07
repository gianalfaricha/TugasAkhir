package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class keliling_persegi extends AppCompatActivity {
    EditText sEditSisi;
    TextView sTextkelilingPersegi;
    Button sHitungKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_persegi);
        sEditSisi =(EditText) findViewById(R.id.editsisipersegi);
        sTextkelilingPersegi = (TextView) findViewById(R.id.kelilingpersegi1);
        sHitungKeliling= (Button) findViewById(R.id.hitungKelilig);

        sHitungKeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Perhitungan();
            }
        });
    }

    public void Perhitungan(){
        Double sisi = Double.parseDouble(sEditSisi.getText().toString());
        Double Perhitungankeliling = sisi * 4;
        sTextkelilingPersegi.setText(Perhitungankeliling.toString());
    }
}