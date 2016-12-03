package com.example.aron.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditDay extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_days);

        Button cancel = (Button)findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }
        });
        Button delete= (Button)findViewById(R.id.delete);
        delete.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }


        });
        Button ok = (Button)findViewById(R.id.ok);
        ok.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }


        });
    }
}