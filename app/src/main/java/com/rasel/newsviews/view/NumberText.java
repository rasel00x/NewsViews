package com.rasel.newsviews.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.rasel.newsviews.R;

public class NumberText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_text);
        Bundle extras = getIntent().getExtras();

        TextView tvNumber = findViewById(R.id.tvNumber);
        TextView tvNumberHistory = findViewById(R.id.tvNumberHistory);

        if (extras != null && extras.containsKey("number") && extras.containsKey("result")) {
            tvNumber.setText(extras.getString("number", "number"));
            tvNumberHistory.setText(extras.getString("result", "N/A"));
        }
    }
}
