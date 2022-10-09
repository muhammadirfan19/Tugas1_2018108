package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class segitiga extends AppCompatActivity {
    EditText alas1, tinggi1, result;
    Button hitung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        alas1 = (EditText) findViewById(R.id.input_alas);
        tinggi1 = (EditText) findViewById(R.id.input_tinggi);
        result = (EditText) findViewById(R.id.output_result);
        hitung = (Button) findViewById(R.id.btn_luas);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (alas1.length() == 0 && tinggi1.length() == 0) {
                    Toast.makeText(getApplication(), "Alas dan Tinggi tidak boleh Kosong", Toast.LENGTH_LONG).show();
                } else if (tinggi1.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang tidak boleh Kosong", Toast.LENGTH_LONG).show();
                } else if (alas1.length() == 0) {
                    Toast.makeText(getApplication(), "Alas tidak boleh Kosong", Toast.LENGTH_LONG).show();
                }else {
                    String alas = alas1.getText().toString();
                    String tinggi =tinggi1.getText().toString();
                    Double alas1 = Double.parseDouble(alas);
                    Double tinggi1 = Double.parseDouble(tinggi);
                    Double hs = LuasSegitiga(alas1, tinggi1);
                    String output = String.valueOf(hs);
                    result.setText(output.toString());
                }
            }
        });
    }
    public double LuasSegitiga(double alas1, double tinggi1){return alas1*tinggi1/2;

    }

}
