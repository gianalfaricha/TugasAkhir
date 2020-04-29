package com.example.exercisesqlite;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class display_mhs extends AppCompatActivity {
    int from_Where_I_Am_Coming = 0;
    private DBHelper mydb ;

    EditText nomhs ;
    EditText phone;
    EditText nama;
    EditText alamat;
    EditText email;

    int id_To_Update = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_mhs);
        //Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        nomhs = (EditText) findViewById(R.id.EditTextNim);
        nama = (EditText) findViewById(R.id.EditTextNama);
        phone = (EditText) findViewById(R.id.EditTextPhone);
        alamat = (EditText) findViewById(R.id.EditTextAddress);
        email = (EditText) findViewById(R.id.EditTextEmail);

        mydb = new DBHelper(this);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int Value = extras.getInt("id");

            if (Value > 0) {
                //means this is the view part not the add contact part.
                Cursor rs = mydb.getData(Value);
                id_To_Update = Value;

                rs.moveToFirst();

                String no = rs.getString(rs.getColumnIndex(DBHelper.MHS_COLUMN_NIM));
                String nam = rs.getString(rs.getColumnIndex(DBHelper.MHS_COLUMN_NAMA));
                String phon = rs.getString(rs.getColumnIndex(DBHelper.MHS_COLUMN_PHONE));
                String addr = rs.getString(rs.getColumnIndex(DBHelper.MHS_COLUMN_ADDRESS));
                String emai = rs.getString(rs.getColumnIndex(DBHelper.MHS_COLUMN_EMAIL));
                if (!rs.isClosed()) {
                    rs.close();
                }
                Button b = (Button) findViewById(R.id.button1);
                b.setVisibility(View.INVISIBLE);

                nomhs.setText((CharSequence) no);
                nomhs.setFocusable(false);
                nomhs.setClickable(false);

                nama.setText((CharSequence) nam);
                nama.setFocusable(false);
                nama.setClickable(false);

                phone.setText((CharSequence) phon);
                phone.setFocusable(false);
                phone.setClickable(false);

                alamat.setText((CharSequence) addr);
                alamat.setFocusable(false);
                alamat.setClickable(false);

                email.setText((CharSequence) emai);
                email.setFocusable(false);
                email.setClickable(false);

            }
        }
    }

    public void run(View view)
    {
        if (nomhs.getText().toString().equals("")||
                nama.getText().toString().equals("")||
                phone.getText().toString().equals("")){
            Toast.makeText(getApplicationContext(), "Data Harus Diisi Semua !",Toast.LENGTH_LONG).show();
        } else {
            mydb.insertContact(nomhs.getText().toString(), nama.getText().toString(), phone.getText().toString(), alamat.getText().toString(), email.getText().toString());
            Toast.makeText(getApplicationContext(), "Insert Data Berhasil",Toast.LENGTH_LONG).show();

            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }
    }

}