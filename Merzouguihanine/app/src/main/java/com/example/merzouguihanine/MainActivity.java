package com.example.merzouguihanine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showUsername(View view){
        EditText username = findViewById(R.id.usertext);
        TextView messg = findViewById(R.id.showUn);
        messg.setText("hello "+ username.getText().toString());

    }
}