package com.testing.luigi21plus.cosasandroid.src;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.testing.luigi21plus.cosasandroid.R;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        TextView registerScreen = (TextView) findViewById(R.id.link_to_login);

        registerScreen.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
            }
        });

    }
}
