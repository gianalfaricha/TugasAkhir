package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class keliling_lingkaran extends AppCompatActivity {
    EditText sEditJarijari;
    TextView sTextkelilingLingkaran;
    Button sHitungkeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_lingkaran);
        sEditJarijari =(EditText) findViewById(R.id.editjarilingkaran);
        sTextkelilingLingkaran = (TextView) findViewById(R.id.kelilinglingkaran1);
        sHitungkeliling = (Button) findViewById(R.id.hitungKelilig);

        sHitungkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Perhitungan();
            }
        });
    }

    public void Perhitungan(){
        Double jarijari = Double.parseDouble(sEditJarijari.getText().toString());
        Double Perhitungankeliling = 2 * jarijari * (22/7);
        sTextkelilingLingkaran.setText(Perhitungankeliling.toString());
    }
}
