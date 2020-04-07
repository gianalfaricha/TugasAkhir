package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class keliling_trapesium extends AppCompatActivity {
    EditText sEditab;
    EditText sEditcd;
    EditText sEditbc;
    EditText sEditad;
    TextView sTextkelilingTrapesium;
    Button sHitungkeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_trapesium);
        sEditab =(EditText) findViewById(R.id.editsisiab);
        sEditcd =(EditText) findViewById(R.id.editsisidc);
        sEditbc =(EditText) findViewById(R.id.editsisibc);
        sEditad =(EditText) findViewById(R.id.editsisiad);
        sTextkelilingTrapesium = (TextView) findViewById(R.id.kelilingtrapesium);
        sHitungkeliling = (Button) findViewById(R.id.hitungKelilig);

        sHitungkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Perhitungan();
            }
        });
    }

    public void Perhitungan(){
        Double sisiab = Double.parseDouble(sEditab.getText().toString());
        Double sisicd = Double.parseDouble(sEditcd.getText().toString());
        Double sisibc = Double.parseDouble(sEditbc.getText().toString());
        Double sisiad = Double.parseDouble(sEditad.getText().toString());
        Double PerhitunganLuas = sisiab + sisiad + sisibc + sisicd ;
        sTextkelilingTrapesium.setText(PerhitunganLuas.toString());
    }
}