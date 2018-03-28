package com.bindubirolgmail.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.*;

public class MainActivity extends AppCompatActivity implements TopSectionFragment.TopsectionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createMeme(String top, String Bottom) {

        BottomSectionFragment bottomSectionFragment= (BottomSectionFragment) getFragmentManager().findFragmentById(R.id.fragment2);
        bottomSectionFragment.setMemeText(top,Bottom);
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
