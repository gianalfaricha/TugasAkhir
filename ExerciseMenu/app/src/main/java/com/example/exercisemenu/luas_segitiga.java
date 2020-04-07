package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luas_segitiga extends AppCompatActivity {
    EditText sEditalas;
    EditText sEditTinggi;
    TextView sTextluasSegitiga;
    Button sHitungLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_segitiga);
        sEditalas =(EditText) findViewById(R.id.editalassegitiga);
        sEditTinggi =(EditText) findViewById(R.id.edittinggisegitiga);
        sTextluasSegitiga = (TextView) findViewById(R.id.luassegitiga2);
        sHitungLuas = (Button) findViewById(R.id.hitungluas);

        sHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Perhitungan();
            }
        });
    }
    public void Perhitungan(){
        Double alas = Double.parseDouble(sEditalas.getText().toString());
        Double tinggi = Double.parseDouble(sEditTinggi.getText().toString());
        Double PerhitunganLuas = (alas * tinggi) / 2;
        sTextluasSegitiga.setText(PerhitunganLuas.toString());
    }
}
