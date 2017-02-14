package com.example.lexuanquynh.fragmentdemo;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.annotation.Nullable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by lexuanquynh on 2/14/17.
 */

public class TopFragment extends Fragment {
    private EditText inputTopImageText;
    private EditText inputBottomImageText;
    private MainActivity mainActivity;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_top, container, false);
        inputTopImageText = (EditText) view.findViewById(R.id.editTopImageText);
        inputBottomImageText = (EditText) view.findViewById(R.id.editBottomImageText);
        final Button applyButton = (Button) view.findViewById(R.id.buttonApply);
        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                applyText();
            }
        });

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof MainActivity) {
            this.mainActivity = (MainActivity) context;
        }
    }

    public void applyText() {
        String topText = this.inputTopImageText.getText().toString();
        String bottomText = this.inputBottomImageText.getText().toString();
        this.mainActivity.showText(topText, bottomText);
    }
}
