package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luas_trapesium extends AppCompatActivity {
    EditText sEditab;
    EditText sEditcd;
    EditText sEditTinggi;
    TextView sTextluasTrapesium;
    Button sHitungLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_trapesium);
        sEditab =(EditText) findViewById(R.id.editsisiab);
        sEditcd =(EditText) findViewById(R.id.editsisidc);
        sEditTinggi =(EditText) findViewById(R.id.edittinggitrapesium);
        sTextluasTrapesium = (TextView) findViewById(R.id.luastrapesium2);
        sHitungLuas = (Button) findViewById(R.id.hitungluas);

        sHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Perhitungan();
            }
        });
    }

    public void Perhitungan(){
        Double sisiab = Double.parseDouble(sEditab.getText().toString());
        Double sisicd = Double.parseDouble(sEditcd.getText().toString());
        Double tinggi = Double.parseDouble(sEditTinggi.getText().toString());
        Double PerhitunganLuas = 2/(sisiab + sisicd) * tinggi ;
        sTextluasTrapesium.setText(PerhitunganLuas.toString());
    }
}