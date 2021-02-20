package com.example.myfirstandriodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            }

    public void bttnOnClick(View view) {
        TextView tvN = (TextView) findViewById(R.id.txtName);
        TextView tvNedit = (TextView) findViewById(R.id.editText);
        tvN.setText(tvNedit.getText());
        TextView tvA = (TextView) findViewById(R.id.txtAge);
        TextView tvAedit = (TextView) findViewById(R.id.editText2);
        tvA.setText(tvAedit.getText());

    }
}