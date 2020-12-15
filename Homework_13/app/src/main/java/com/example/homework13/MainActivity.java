package com.example.homework13;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClicked(View v)
    {
        TextView myTextView = this.findViewById(R.id.myTextView);
        myTextView.setText("Dominic");
        TextView theTextView = this.findViewById(R.id.theTextView);
        theTextView.setText("Simon");
    }

}
