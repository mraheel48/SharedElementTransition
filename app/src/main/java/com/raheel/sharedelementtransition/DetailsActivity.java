package com.raheel.sharedelementtransition;

import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by anupamchugh on 14/04/16.
 */
public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        String[] array = getIntent().getStringArrayExtra("array");


        RelativeLayout rl = (RelativeLayout) findViewById(R.id.layout);
        rl.setBackgroundColor(Color.parseColor(array[3]));

        TextView textView = (TextView) findViewById(R.id.heading);
        textView.setText(array[0]);
        TextView type = (TextView) findViewById(R.id.language);
        type.setText(array[1]);
        TextView desc = (TextView) findViewById(R.id.desc);
        desc.setText(array[2]);

    }

    @Override
    public void onBackPressed() {
        ActivityCompat.finishAfterTransition(this);
    }
}



