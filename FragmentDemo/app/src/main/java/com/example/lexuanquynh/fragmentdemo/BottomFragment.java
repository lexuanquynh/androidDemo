package com.example.lexuanquynh.fragmentdemo;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by lexuanquynh on 2/14/17.
 */

public class BottomFragment extends Fragment {
    private TextView topText;
    private TextView bottomText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_bottom, container, false);
        topText = (TextView) view.findViewById(R.id.tvtop);
        bottomText = (TextView) view.findViewById(R.id.tvBottom);

        return view;
    }

    public void showText(String topImageText, String bottomImageText) {
        topText.setText(topImageText);
        bottomText.setText(bottomImageText);
    }
}
