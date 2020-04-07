package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luas_persegi extends AppCompatActivity {
    EditText sEditSisi;
    TextView sTextluasPersegi;
    Button sHitungLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi);
        sEditSisi =(EditText) findViewById(R.id.editsisipersegi);
        sTextluasPersegi = (TextView) findViewById(R.id.luaspersegi2);
        sHitungLuas = (Button) findViewById(R.id.hitungluas);

        sHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Perhitungan();
            }
        });
    }

    public void Perhitungan(){
        Double sisi = Double.parseDouble(sEditSisi.getText().toString());
        Double PerhitunganLuas = sisi * sisi;
        sTextluasPersegi.setText(PerhitunganLuas.toString());
    }
}