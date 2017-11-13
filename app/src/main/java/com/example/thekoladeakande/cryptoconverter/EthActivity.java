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
   String result;
    EditText editText;
    EditText  editText1;
    double currency;
   TextView summaryText;
    double ethValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eth);
        Button button = (Button) findViewById(R.id.eth_exchange_button);
        Typeface iconfont = Typeface.createFromAsset(getAssets(), "fontawesome-webfont.ttf");
        button.setTypeface(iconfont);

        summaryText = (TextView) findViewById(R.id.eth_summary_text);
        editText1 = (EditText) findViewById(R.id.currency_Text);
        editText = (EditText) findViewById(R.id.eth_number);
        editText.setText("0");
        editText1.setText("0");



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if (result == null )
               {
                   Toast.makeText(EthActivity.this, "Select a valid currency for conversion", Toast.LENGTH_SHORT).show();
               }

                if (result !=null) {
                    ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);

                    Call<CurrencyValue> call =
                            apiService.getValue("ETH", result);


                    // Set up progress before call
                    final ProgressDialog progressDoalog;
                    progressDoalog = new ProgressDialog(EthActivity.this);
                    progressDoalog.setMax(100);
                    progressDoalog.setMessage("Getting currency Value ");
                    progressDoalog.setTitle("ProgressDialog bar example");
                    progressDoalog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                    // show it
                    progressDoalog.show();


                    call.enqueue(new Callback<CurrencyValue>() {
                        @Override
                        public void onResponse(Call<CurrencyValue> call, Response<CurrencyValue> response) {
                            progressDoalog.dismiss();

                            if (result.equals("USD")) {
                                double currencyValue2 = response.body().getUSD();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);
                            } else if (result.equals("NGN")) {
                                double currencyValue2 = response.body().getNGN();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("NLG")) {
                                double currencyValue2 = response.body().getNLG();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("NLG")) {
                                double currencyValue2 = response.body().getNLG();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("GBP")) {
                                double currencyValue2 = response.body().getGBP();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("ESP")) {
                                double currencyValue2 = response.body().getESP();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("CNY")) {
                                double currencyValue2 = response.body().getCNY();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("AUD")) {
                                double currencyValue2 = response.body().getAUD();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("DMK")) {
                                double currencyValue2 = response.body().getDMK();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("EUR")) {
                                double currencyValue2 = response.body().getEUR();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("SAR")) {
                                double currencyValue2 = response.body().getSAR();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("SAR")) {
                                double currencyValue2 = response.body().getSAR();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("CHF")) {
                                double currencyValue2 = response.body().getCHF();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("ZAR")) {
                                double currencyValue2 = response.body().getZAR();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("ITL")) {
                                double currencyValue2 = response.body().getITL();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("ITL")) {
                                double currencyValue2 = response.body().getITL();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("GHS")) {
                                double currencyValue2 = response.body().getGHS();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("RUB")) {
                                double currencyValue2 = response.body().getRUB();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            } else if (result.equals("QAR")) {
                                double currencyValue2 = response.body().getQAR();
                                currency = Double.valueOf(editText1.getText().toString());
                                ethValue = Double.valueOf(editText.getText().toString());
                                if (ethValue > 0 && currency == 0) {
                                    double currencyValue3 = ethValue * currencyValue2;
                                    editText1.setText(String.valueOf(currencyValue3));
                                    String summary = String.valueOf(currencyValue3);
                                    summaryText.setText(String.valueOf(ethValue) + "ETH equals " + summary + result);
                                } else if (currency > 0 && ethValue == 0) {
                                    double currencyValue4 = currency / currencyValue2;
                                    editText.setText(String.valueOf(currencyValue4));

                                    summaryText.setText(String.valueOf(currencyValue4) + "ETH equals " + currency + result);
                                } else
                                    editText.setText("1");
                                editText1.setText(String.valueOf(currencyValue2));
                                summaryText.setText("1 ETH equals " + currencyValue2 + result);

                            }


                        }//end of onResponse


                        @Override
                        public void onFailure(Call<CurrencyValue> call, Throwable t) {

                            progressDoalog.dismiss();
                            Toast.makeText(EthActivity.this, "Verify network connection ", Toast.LENGTH_LONG).show();
                        }
                    });

                }// end of if statement for retrofit api call

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
                result = data.getStringExtra("ABB");
                TextView textView = (TextView)findViewById(R.id.textView3);
                textView.setText(result);

            }
        }
    }



}// end of activity
