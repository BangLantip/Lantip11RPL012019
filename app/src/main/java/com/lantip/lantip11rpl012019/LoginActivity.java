package com.lantip.lantip11rpl012019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText etUsername;
    EditText etpassword;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etUsername=findViewById(R.id.txtusername);
        etpassword=findViewById(R.id.txtpassword);
        btnlogin=findViewById(R.id.btnlogin);
        getSupportActionBar().hide();
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(etUsername.getText().toString().isEmpty()&&(etpassword.getText().toString().isEmpty())){
                    Toast.makeText(LoginActivity.this, "Jangan DIKOSONGIN TOD!", Toast.LENGTH_SHORT).show();
                } else {
                    if (etUsername.getText().toString().equals("lantip") &&
                            (etpassword.getText().toString().equals("abdullah"))){
                        Toast.makeText(LoginActivity.this, "Login sukses", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(LoginActivity.this, "Login Gagal Tod", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }

}