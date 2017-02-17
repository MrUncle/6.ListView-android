package com.example.qyoungde.listviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0 = (Button) findViewById(R.id.button0);
        btn0.setOnClickListener(this);
        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(this);
        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(this);
        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(this);
        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button0:{
                Intent intent = new Intent(this,SimpleList.class);
                startActivity(intent);
                break;
            }
            case R.id.button1:{
                Intent intent = new Intent(this,TitleList.class);
                startActivity(intent);
                break;
            }
            case R.id.button2:{
                Intent intent = new Intent(this,IconList.class);
                startActivity(intent);
                break;
            }case R.id.button3:{
                Intent intent = new Intent(this,ColorList.class);
                startActivity(intent);
                break;
            }case R.id.button4:{
                Intent intent = new Intent(this,ArrayList.class);
                startActivity(intent);
                break;
            }
            default:{
                break;
            }
        }
    }
}
