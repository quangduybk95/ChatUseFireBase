package com.google.firebase.codelab.friendlychat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChooseActivity extends AppCompatActivity {
    Button btn_chatgroup,btn_chatlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);
        btn_chatgroup = (Button) findViewById(R.id.btn_chatgroup);
        btn_chatlist = (Button) findViewById(R.id.btn_chatlist);
        btn_chatlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btn_chatgroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ChooseActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}
