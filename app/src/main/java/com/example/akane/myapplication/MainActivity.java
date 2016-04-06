package com.example.akane.myapplication;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDisp = (Button)findViewById(R.id.btnDisp);
        btnDisp.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // Sub 画面を起動
                Intent intent = new Intent();
                intent.setClassName("com.example.akane.myapplication", "com.example.akane.myapplication.SubActivity1");
                startActivity(intent);
            }
        });
    }


}
