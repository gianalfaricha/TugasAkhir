package com.example.exercisemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class luas_persegi_panjang extends AppCompatActivity {
    EditText sEditpanjang;
    EditText sEditLebar;
    TextView sTextluasPersegiPanjang;
    Button sHitungLuas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegi_panjang);
        sEditpanjang =(EditText) findViewById(R.id.editpanjangsegipanjang);
        sEditLebar =(EditText) findViewById(R.id.editlebarsegipanjang);
        sTextluasPersegiPanjang = (TextView) findViewById(R.id.luassegipanjang2);
        sHitungLuas = (Button) findViewById(R.id.hitungluas);

        sHitungLuas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Perhitungan();
            }
        });
    }
    public void Perhitungan(){
        Double Panjang = Double.parseDouble(sEditpanjang.getText().toString());
        Double Lebar = Double.parseDouble(sEditLebar.getText().toString());
        Double PerhitunganLuas = Panjang * Lebar;
        sTextluasPersegiPanjang.setText(PerhitunganLuas.toString());
    }
}
