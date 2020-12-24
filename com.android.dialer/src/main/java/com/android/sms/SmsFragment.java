package com.android.sms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.android.dialer.R;

public class SmsFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sms_fragment);
    }
}