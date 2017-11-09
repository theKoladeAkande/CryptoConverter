package com.example.thekoladeakande.cryptoconverter;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class EthActivity extends AppCompatActivity {
   public static final  int REQUEST_CODE =2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eth);
        Button button = (Button) findViewById(R.id.eth_exchange_button);
        Typeface iconfont = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        button.setTypeface(iconfont);



        final EditText editText1 = (EditText) findViewById(R.id.currency_Text);

        TextView textview = (TextView) findViewById(R.id.textView3);
        final  String abb = textview.getText().toString();



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

                Call<CurrencyValue> call =
                        apiService.getValue("ETH", abb);


                // Set up progress before call
                final ProgressDialog progressDoalog;
                progressDoalog = new ProgressDialog(EthActivity.this);
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
                        progressDoalog.dismiss();
                        Toast.makeText(EthActivity.this, "pls check your network connection ", Toast.LENGTH_LONG).show();
                    }
                });
            }
        });






    }// end of on create method

    public void eth_button_click(View v)
    {
        Toast.makeText(EthActivity.this, "only ETH conversion here",
                Toast.LENGTH_LONG).show();
    }
    public void eth_other_currencies_click(View v){

        Intent myIntent =  new Intent(EthActivity.this,CurrencyActivity.class);
        startActivityForResult(myIntent,REQUEST_CODE);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == REQUEST_CODE) {

            if (resultCode == Activity.RESULT_OK) {
                String result = data.getStringExtra("ABB");
                TextView textView = (TextView)findViewById(R.id.textView3);
                textView.setText(result);

            }
        }
    }



}// end of activity
