package com.example.crazynet.taxidegladriver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class splashActivity extends AppCompatActivity {

    Button login , sign;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        login = findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tologin();
            }
        });
        
        sign =findViewById(R.id.signup);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tosign();
            }
        });
    }

    private void tosign() {
        Intent intent = new Intent(this,signActivity.class);
        startActivity(intent);
    }

    public void tologin(){
        Intent intent = new Intent(this,loginActivity.class);
        startActivity(intent);
    }
}
