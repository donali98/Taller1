package com.example.taller1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private  Button mButton_action;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        mButton_action = findViewById(R.id.action_button);
        mButton_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mButton_action.setText(getString(R.string.on_click_action));
            }
        });
    }
}
