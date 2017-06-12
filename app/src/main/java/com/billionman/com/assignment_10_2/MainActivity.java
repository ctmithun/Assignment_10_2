package com.billionman.com.assignment_10_2;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private boolean isMobile = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager manager = getSupportFragmentManager();

        Frag_Detail detailsFrag = (Frag_Detail) manager.findFragmentById(R.id.detaFrag);

        if(detailsFrag==null){
            isMobile = true;
        } else {
            isMobile = false;
        }
    }

    public void onListClick(String item) {
        if(isMobile){
            //start aCtivity
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            intent.putExtra("layoutName",item);
            startActivity(intent);
        } else {
            //udpate next screen
            FragmentManager manager = getSupportFragmentManager();

            Frag_Detail detailsFrag = (Frag_Detail) manager.findFragmentById(R.id.detaFrag);
            detailsFrag.updateScreenHere(item);
        }

    }
}
