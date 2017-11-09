package com.example.thekoladeakande.cryptoconverter;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class menuActivity extends AppCompatActivity {
private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Attaching the layout to the toolbar object
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        // Setting toolbar as the ActionBar with setSupportActionBar() call
         this.setSupportActionBar(toolbar);

        // applies font to the btc text
        TextView textView = (TextView) findViewById(R.id.btc_text);
       Typeface custom_font = Typeface.createFromAsset(getAssets(), "SourceSansPro-Semibold.otf");
      textView.setTypeface(custom_font);

       TextView textView2 = (TextView) findViewById(R.id.eth_text);
        Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "SourceSansPro-Semibold.otf");
        textView2.setTypeface(custom_font2);

     Typeface iconFont = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
       TextView textView3 = (TextView) findViewById(R.id.btc_icon);
        textView3.setTypeface(iconFont);

        Typeface iconFont2 = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        TextView textView4 = (TextView) findViewById(R.id.eth_icon);
        textView4.setTypeface(iconFont2);

    }// onCreate Method

   public void btcClick(View v){
       Intent myIntent =  new Intent(menuActivity.this,BtcActivity.class);
            startActivity(myIntent);
   }


    public void ethClick(View v){
        Intent myIntent =  new Intent(menuActivity.this,EthActivity.class);
        startActivity(myIntent);
    }

}//end of class menuActivity





