package com.example.s.butonrenk;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    private TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text=(TextView) findViewById(R.id.tvYazi);
        button1=(Button) findViewById(R.id.Buton1);
        button2=(Button) findViewById(R.id.Buton2);
        button3=(Button) findViewById(R.id.Buton3);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeText();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeText1();
            }
        });
    }
    private void changeText() {        button3.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            changeText2();
        }
    });
        text.setTextColor(Color.GREEN);
    }
    private void changeText1() {
        text.setTextColor(Color.BLUE);
    }
    private void changeText2() {
        text.setTextColor(Color.RED);
    }
}
