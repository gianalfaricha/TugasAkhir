package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class keliling_segitiga extends AppCompatActivity {
    EditText sEditalas;
    EditText sEditsisi1;
    EditText sEditsisi2;
    TextView sTextkelilingSegitiga;
    Button sHitungkeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keliling_segitiga);
        sEditalas =(EditText) findViewById(R.id.editalassegitiga);
        sEditsisi1 =(EditText) findViewById(R.id.editsisipersegi);
        sEditsisi2 =(EditText) findViewById(R.id.editsisisegitiga2);
        sTextkelilingSegitiga = (TextView) findViewById(R.id.kelilingsegitiga);
        sHitungkeliling = (Button) findViewById(R.id.hitungKelilig);

        sHitungkeliling.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Perhitungan();
            }
        });
    }

    public void Perhitungan(){
        Double alas = Double.parseDouble(sEditalas.getText().toString());
        Double sisi1 = Double.parseDouble(sEditsisi1.getText().toString());
        Double sisi2 = Double.parseDouble(sEditsisi2.getText().toString());
        Double PerhitunganKeliling = alas + sisi1 + sisi2;
        sTextkelilingSegitiga.setText(PerhitunganKeliling.toString());
    }
}
