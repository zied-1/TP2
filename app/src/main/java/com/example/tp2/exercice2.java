package com.example.tp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class exercice2 extends AppCompatActivity {

    EditText e1;
    EditText paswd;
    Button e2;
    String text1="zied";
    String text2="123";


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercice2);

        e1=findViewById(R.id.editText);
        paswd=findViewById(R.id.Password);
        e2=findViewById(R.id.button4);
        e2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().equals(text1) && paswd.getText().toString().equals(text2))
                {
                    Intent i= new Intent(exercice2.this,SecondActivity.class);

                    startActivity(i);
                }
                else{

                    Toast.makeText(exercice2.this,"Login Failed",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}