package com.example.crazynet.taxidegladriver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signActivity extends AppCompatActivity {

    Button log ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);

        log = findViewById(R.id.btn_login);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tohome();
            }
        });
    }

    private void tohome() {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
