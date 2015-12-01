package com.example.guest.funfacts;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;



public class FunFactsActivity extends AppCompatActivity {
    private TextView factArea;
    private Button buttonText;
    private FactBook mFactBook = new FactBook();
    private RelativeLayout view;
    public static final String TAG = "color";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        mFactBook.mFacts = getResources().getStringArray(R.array.facts);
        mFactBook.mColors = getResources().getStringArray(R.array.colors);

        //Declare view variables and assign them the views from the layout file
        factArea = (TextView) findViewById(R.id.factTextView);
        buttonText = (Button) findViewById(R.id.showFactButton);
        view = (RelativeLayout) findViewById(R.id.relLayout);

        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();
                String color = mFactBook.getColor();

                // Update the label with our dynamic fact
                factArea.setText(fact);
                buttonText.setText("Show Another Fun Fact");
                Log.d(TAG, color);
                view.setBackgroundColor(Color.parseColor(color));


            }
        };
        showFactButton.setOnClickListener(listener);
    }


}
