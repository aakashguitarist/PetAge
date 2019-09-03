package com.example.petage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void agefun(View v)
    {
        EditText e= findViewById(R.id.editText);
        int age= Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(e.getText().toString());
        TextView tx= findViewById(R.id.textView);
        tx.setText(age+" ");
    }
}
