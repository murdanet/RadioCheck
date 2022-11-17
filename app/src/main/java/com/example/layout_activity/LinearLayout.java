package com.example.layout_activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LinearLayout extends AppCompatActivity {
    ImageButton img_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
        img_btn=(ImageButton)findViewById(R.id.imageButton2);
        img_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LinearLayout.this, GridLayout.class);
                startActivity(intent);
            }
        });
    }
}