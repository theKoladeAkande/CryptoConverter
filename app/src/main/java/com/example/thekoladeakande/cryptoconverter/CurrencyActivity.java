package com.example.thekoladeakande.cryptoconverter;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CurrencyActivity extends AppCompatActivity {
    private List<Currencies> currenciesList = new ArrayList<>();
    private RecyclerView recyclerView;
    private CurrencyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_curreny);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new CurrencyAdapter(currenciesList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        mAdapter.setListener(new CurrencyAdapter.CurrencyClickListener() {
            @Override
            public void onCurrencyClicked(Currencies currencies) {

                Intent intent = new Intent();
                intent.putExtra("ABB", currencies.getAbb());
                setResult(Activity.RESULT_OK, intent);
                finish();

            }
            });

            prepareCurrencyData();
    }

    private void prepareCurrencyData() {
         currenciesList.add(new Currencies("Nigerian Naira",  "NGN"));

        currenciesList.add(new Currencies("Spain Peseta",  "ESP"));
        currenciesList.add(new Currencies("Great Britain Pound",  "GBP"));
        currenciesList.add(new Currencies("Euro",  "EUR"));
        currenciesList.add(new Currencies("Australia Dollar",  "AUD"));
        currenciesList.add(new Currencies("Japan Yen",  "JPY"));
        currenciesList.add(new Currencies("Switzerland Franc",  "CHF"));
        currenciesList.add(new Currencies("USA Dollar",  "USD"));
        currenciesList.add(new Currencies("Germany Mark",  "DMK"));
        currenciesList.add(new Currencies("China Yuan/Renminbi",  "CNY"));
        currenciesList.add(new Currencies("Russia Rouble",  "RUB"));
        currenciesList.add(new Currencies("Saudi Arabia Riyal",  "SAR"));
        currenciesList.add(new Currencies("South Korea Won",  "KRW"));
        currenciesList.add(new Currencies("South Africa Rand",  "ZAR"));
        currenciesList.add(new Currencies("Ghana New Cedi",  "GHS"));
        currenciesList.add(new Currencies("Hong Kong Dollar",  "HKD"));
        currenciesList.add(new Currencies("Netherlands Guilder",  "NLG"));
        currenciesList.add(new Currencies("Italy Lira",  "ITL"));
        currenciesList.add(new Currencies("Israel New Shekel",  "ILS"));
        currenciesList.add(new Currencies("Qatar Rial",  "QAR"));


        mAdapter.notifyDataSetChanged();    }
}
