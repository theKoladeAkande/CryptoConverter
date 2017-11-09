package com.example.thekoladeakande.cryptoconverter;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.icu.util.Currency;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BtcActivity extends  AppCompatActivity {

    public static final int REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btc);


        Button button = (Button) findViewById(R.id.btc_exchange_button);
        Typeface iconfont = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        button.setTypeface(iconfont);



         final EditText editText1 = (EditText) findViewById(R.id.currency_Text);

        TextView textview = (TextView) findViewById(R.id.textView3);
       final  String abb = textview.getText().toString();

        final EditText editText = (EditText) findViewById(R.id.btc_number);
        //Double btcValue = Double.parseDouble(editText.getText().toString());

       button.setOnClickListener(new View.OnClickListener() {
            @Override
           public void onClick(View view) {
                ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

                Call<CurrencyValue> call =
                        apiService.getValue("BTC", abb);






                // Set up progress before call
                final ProgressDialog progressDoalog;
                progressDoalog = new ProgressDialog(BtcActivity.this);
                progressDoalog.setMax(100);
                progressDoalog.setMessage("Fetching data");
                progressDoalog.setTitle("ProgressDialog bar example");
                progressDoalog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                // show it
                progressDoalog.show();


                call.enqueue(new Callback<CurrencyValue>() {
               @Override
              public void onResponse(Call<CurrencyValue>call, Response<CurrencyValue> response){
                   progressDoalog.dismiss();
                   double  btcvalue2 =    response.body().getValue();
                   editText1.setText(String.valueOf(btcvalue2));
                 }
                    @Override
                    public void onFailure(Call<CurrencyValue> call, Throwable t) {
                        Toast.makeText(BtcActivity.this, "pls check your network connection", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });







    }//end of on create method

   public void btc_other_currencies_click(View v)
  {

      Intent myIntent =  new Intent(BtcActivity.this,CurrencyActivity.class);
       startActivityForResult(myIntent,REQUEST_CODE);
  }




    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == REQUEST_CODE) {

            if (resultCode == Activity.RESULT_OK) {
                String result = data.getStringExtra("ABB");
                TextView textView = (TextView)findViewById(R.id.textView3);
                textView.setText(result);

            } else if (resultCode == Activity.RESULT_CANCELED) {
                // some stuff that will happen if there's no result
            }
        }
    }








    public void btc_button_click(View v)
   {
       Toast.makeText(BtcActivity.this, "only BTC conversion here",
               Toast.LENGTH_LONG).show();
   }













   }// end of Activity
