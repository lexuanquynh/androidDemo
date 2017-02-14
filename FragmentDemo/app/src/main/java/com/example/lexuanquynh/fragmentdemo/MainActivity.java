package com.example.lexuanquynh.fragmentdemo;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showText(String topImageText, String bottomImageText) {
        BottomFragment bottomFragment = (BottomFragment) this.getSupportFragmentManager().findFragmentById(R.id.bottomFragment);
        bottomFragment.showText(topImageText, bottomImageText);

    }
}
