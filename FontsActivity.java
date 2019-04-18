package com.example.gulraiztariq.androidtutorials.examples;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.gulraiztariq.androidtutorials.R;

public class FontsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fonts);

        String fontPath = "fonts/automobile-Inverse.otf";
        TextView textView = findViewById(R.id.pk);
        Typeface typeface = Typeface.createFromAsset(getAssets(),fontPath);
        textView.setTypeface(typeface);
    }
}
