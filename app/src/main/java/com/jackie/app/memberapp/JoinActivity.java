package com.jackie.app.memberapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class JoinActivity extends Activity implements View.OnClickListener {

    TextView et_name, et_id, et_pw, et_ssn, et_email, et_phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
        et_name = (TextView) findViewById(R.id.et_name);
        et_id = (TextView) findViewById(R.id.et_id);
        et_pw = (TextView) findViewById(R.id.et_pw);
        et_ssn = (TextView) findViewById(R.id.et_ssn);
        et_email = (TextView) findViewById(R.id.et_email);
        et_phone = (TextView) findViewById(R.id.et_phone);
    }

    public void onClick(View v){
        switch (v.getId()){
            case R.id.bt_join:
                Toast.makeText(JoinActivity.this,"Name: "+et_name.getText().toString()
                        +" ID: "+et_id.getText().toString()
                        +" PW: "+et_pw.getText().toString()
                        +" SSN: "+et_ssn.getText().toString()
                        +" Email: "+et_email.getText().toString()
                        +" Phone: "+et_phone.getText().toString(),Toast.LENGTH_LONG).show();
                break;
            case R.id.bt_reset:
                startActivity(new Intent(this,MainActivity.class));
                break;
        }
    }
}
