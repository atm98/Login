package com.agnt45.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    TextView t1;
    String aa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        t1 = (TextView) findViewById(R.id.textView);
        Intent i = this.getIntent();
        aa = i.getStringExtra("email_key");
        t1.setText("Welcome back" + aa);

    }
}
