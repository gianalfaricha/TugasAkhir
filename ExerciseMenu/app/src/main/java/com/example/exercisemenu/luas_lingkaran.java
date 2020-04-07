package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luas_lingkaran extends AppCompatActivity {
    EditText sEditJarijari;
    TextView sTextluasLingkaran;
    Button sHitungLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);
        sEditJarijari =(EditText) findViewById(R.id.editjarilingkaran);
        sTextluasLingkaran = (TextView) findViewById(R.id.luaslingkaran2);
        sHitungLuas = (Button) findViewById(R.id.hitungluas);

        sHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Perhitungan();
            }
        });
    }
    public void Perhitungan(){
        Double jarijari = Double.parseDouble(sEditJarijari.getText().toString());
        Double PerhitunganLuas = (jarijari*jarijari) * (22/7);
        sTextluasLingkaran.setText(PerhitunganLuas.toString());
    }
}
