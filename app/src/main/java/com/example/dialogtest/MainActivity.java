package com.example.dialogtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.app.AlertDialog;
import android.view.View;
import android.app.AlertDialog.Builder;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView textQuestion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClickAlert(View v) {
        textQuestion = findViewById(R.id.textView);
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("Hello");
        builder.setMessage("Alerta");
        builder.setNegativeButton("CANCEL", null);
        builder.setPositiveButton("OK", null);
        builder.show();
        textQuestion.setText("Has pulsado ok");

    }

}
