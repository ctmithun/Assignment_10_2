package com.billionman.com.assignment_10_2;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        FragmentManager fm = getSupportFragmentManager();
        Frag_Detail fd = new Frag_Detail();
        fm.findFragmentById(R.id.fragDetail);
        fd.setText(getIntent().getStringExtra("layoutName"));
        fm.beginTransaction().add(R.id.detaFrag,fd).commit();
        findViewById(R.id.detaFrag).setVisibility(View.VISIBLE);
    }
}
