package com.agnt45.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText et1,et2;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et1 = (EditText)findViewById(R.id.user);
        et2 = (EditText)findViewById(R.id.passwd);
        bt1 = (Button)findViewById(R.id.button);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et1.getText().toString().equals("ar2691") || et2.getText().equals("atm98")){
                    login(et1.getText().toString());
                }
                else {
                    error();
                }
            }
        });
    }

    private void error() {
        Toast.makeText(this,"ERROR CANT LOGIN",Toast.LENGTH_SHORT).show();
    }

    public void login(String a){
        Intent i = new Intent(LoginActivity.this,HomeActivity.class);
        i.putExtra("email_key",a);
        startActivity(i);
    }
}
