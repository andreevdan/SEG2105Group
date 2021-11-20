package com.example.termproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MemberLoginActivity extends AppCompatActivity {


    TextView memberTitle, memberPassword, memberUsername;
    Button mBTN, btnBack4;
    EditText usernameBox, passwordBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_login);

        memberTitle = (TextView) findViewById(R.id.adminTitle);
        memberUsername = (TextView) findViewById(R.id.adminUsername);
        memberPassword = (TextView) findViewById(R.id.adminPassword);

        mBTN = (Button) findViewById(R.id.adminLoginBTN);
        btnBack4 = (Button) findViewById(R.id.btnBack4);

        usernameBox = (EditText) findViewById(R.id.editUsernameA);
        passwordBox = (EditText) findViewById(R.id.editPasswordA);

        btnBack4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                back4();
            }
        });
    }
    private void back4(){
        Intent intent= new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}