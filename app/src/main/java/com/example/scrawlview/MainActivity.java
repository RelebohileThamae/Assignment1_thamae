package com.example.scrawlview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {



    Button btn1,btn2,btn3;
    int choosenceleb = 0;
    View v;
    TextView tv;
    int a = 1;
    ScrollView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        v = findViewById(R.id.imageView);
        tv = findViewById(R.id.header);
        l = findViewById(R.id.linear);

    }
    //pressing the 1st button
    public void btn1(View view) {
        if(a == 1){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            btn1.setText("CHAKELA");
            btn2.setText("LIPHALAPHA");
            btn3.setText("MAHLANYA");
            v.setBackgroundResource(R.drawable.celeb);
            choosenceleb = choosenceleb + 1;
            a = a + 1;
        }

        else if(a == 2){
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
            btn1.setText("CHAKELA");
            btn2.setText("MAHLANYA");
            btn3.setText("LILAPHALAPHA");
            v.setBackgroundResource(R.drawable.chakela);
            a = a + 1;
        }
        else if(a == 3){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            choosenceleb = choosenceleb + 1;
            tv.setText("YOUR SCORE IS " + choosenceleb);
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            v.setBackgroundResource(R.drawable.designing);
        }

    }
    //pressing the 2nd button
    public void btn2(View view) {
        if(a == 1){
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
            btn1.setText("CHAKELA");
            btn2.setText("LIPHALAPHA");
            btn3.setText("MAHLANYA");
            v.setBackgroundResource(R.drawable.celeb);
            a = a + 1;
        }

        else if(a == 2){
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
            btn1.setText("CHAKELA");
            btn2.setText("MAHLANYA");
            btn3.setText("LILAPHALAPHA");
            v.setBackgroundResource(R.drawable.chakela);
            choosenceleb = choosenceleb + 1;
            a = a + 1;
        }
        else if(a == 3){
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            v.setBackgroundResource(R.drawable.designing);
            tv.setText("YOUR SCORE IS " + choosenceleb);

        }
    }
    //pressing the 3rd button
    public void btn3(View view) {
        if(a == 1){
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
            btn1.setText("CHAKELA");
            btn2.setText("LIPHALAPHA");
            btn3.setText("MAHLANYA");
            v.setBackgroundResource(R.drawable.celeb);
            choosenceleb = choosenceleb + 1;
            a = a + 1;
        }

        else if(a == 2){
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
            btn1.setText("CHAKELA");
            btn2.setText("MAHLANYA");
            btn3.setText("LILAPHALAPHA");
            v.setBackgroundResource(R.drawable.chakela);
            a = a + 1;
        }
        else if(a == 3){
            Toast.makeText(this, "Incorrect", Toast.LENGTH_SHORT).show();
            btn1.setText("");
            btn2.setText("");
            btn3.setText("");
            v.setBackgroundResource(R.drawable.designing);
            tv.setText("YOUR SCORE IS " + choosenceleb);
        }
    }
}