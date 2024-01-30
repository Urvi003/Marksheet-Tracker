package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Page2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        TextView username1 = (TextView) findViewById(R.id.username1);
        TextView Email = (TextView) findViewById(R.id.Email);
        TextView password1 = (TextView) findViewById(R.id.password1);
        findViewById(R.id.Conformpassword);

        MaterialButton signup = (MaterialButton) findViewById(R.id.signup);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    openPage2();
                }
        });
    }
    public void openPage2 (){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    }