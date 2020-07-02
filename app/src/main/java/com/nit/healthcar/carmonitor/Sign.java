package com.nit.healthcar.carmonitor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class Sign extends AppCompatActivity {
    private EditText editText3;
    private EditText editText4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign);
        editText3 = findViewById(R.id.editText3);
        editText4 = findViewById(R.id.editText);
    }
}
