package com.example.missoin10;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int mone=0;
    int mone2=0;
    ToggleButton tB;
    Switch switch1;
    Button btn;
    ImageView iV;
    int change;
    int[] id= new int[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tB = (ToggleButton) findViewById(R.id.tB);
        switch1 = (Switch) findViewById(R.id.switch1);
        btn = findViewById(R.id.btn);
        iV =  findViewById(R.id.iV);
        id[0]=R.drawable.banana;
        id[1]=R.drawable.correct;
        id[2]=R.drawable.random;
        id[3]=R.drawable.dog;

    }
    public void clicked2(View v){
        if(tB.isChecked()){
            Toast.makeText(this, "Toggle in work status", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "Toggle in not work status", Toast.LENGTH_LONG).show();
        }

    }
    public void clicked3(View v){
        if(switch1.isChecked()){
            Toast.makeText(this, "Toggle in work status", Toast.LENGTH_LONG).show();
        }else {
            Toast.makeText(this, "Toggle in not work status", Toast.LENGTH_LONG).show();
        }

    }
    public void onClick(View view)
    {
        if(switch1.isChecked() && tB.isChecked())
        {
            iV.setImageResource(id[0]);
        } else if (switch1.isChecked() && !tB.isChecked()) {
            iV.setImageResource(id[1]);

        } else if (!switch1.isChecked() && tB.isChecked()) {
            iV.setImageResource(id[2]);

        } else if (!switch1.isChecked() && !tB.isChecked()) {
            iV.setImageResource(id[3]);
        }


    }
}