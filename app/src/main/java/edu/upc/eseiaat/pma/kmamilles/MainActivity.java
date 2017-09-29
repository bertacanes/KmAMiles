package edu.upc.eseiaat.pma.kmamilles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_a_milles = (Button) findViewById(R.id.btn_a_milles);
        Button btn_a_km = (Button) findViewById(R.id.btn_a_km);

        final EditText edit_km = (EditText) findViewById(R.id.edit_kilometres);
        final EditText edit_milles = (EditText) findViewById(R.id.edit_milles);


        btn_a_milles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("berta", "btn_a_millas clickado");
                String skm = edit_km.getText().toString();
                float km = Float.parseFloat(skm);
                float milles = km / 1.609f;
                String smilles = String.format("%f", milles);
                edit_milles.setText(smilles);

            }
        });

        btn_a_km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("berta", "btn_a_km clickado");
                String smilles = edit_milles.getText().toString();
                float milles = Float.parseFloat(smilles);
                float km = milles * 1.609f;
                String skm = String.format("%f", km);
                edit_km.setText(skm);

            }
        });


        edit_km.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String skm = edit_km.getText().toString();
                float km = Float.parseFloat(skm);
                float milles = km / 1.609f;
                String smilles = String.format("%f", milles);
                edit_milles.setText(smilles);

            }
        });

        /*
        edit_milles.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String smilles = edit_km.getText().toString();
                float milles = Float.parseFloat(smilles);
                float km = milles * 1.609f;
                String skm = String.format("%f", km);
                edit_km.setText(skm);

            }
        });
        */

        }

    }
