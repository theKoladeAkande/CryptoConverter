package com.example.thekoladeakande.cryptoconverter;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.Currency;
import java.util.List;

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.MyViewHolder> {

    private List<Currencies> currenciesList;
    private CurrencyClickListener listener;
    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView currency, abb;


        public MyViewHolder(View view) {
            super(view);

            view.setClickable(true);
            view.setOnClickListener(this);
            currency = (TextView) view.findViewById(R.id.currency);
            abb = (TextView) view.findViewById(R.id.abb);
        }
        @Override
        public void onClick(View v) {
            if(listener != null){
                listener.onCurrencyClicked(currenciesList.get(getAdapterPosition()));
            }
        }

    }

    public void setListener(CurrencyClickListener listener) {
        this.listener = listener;
    }

    public interface CurrencyClickListener{
        void onCurrencyClicked(Currencies currency);
    }
    public CurrencyAdapter(List<Currencies> currenciesList) {
        this.currenciesList = currenciesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.currency_list,parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Currencies currency = currenciesList.get(position);
        holder.currency.setText(currency.getCurrency());

        holder.abb.setText(currency.getAbb());
    }

    @Override
    public int getItemCount() {
        return currenciesList.size();
    }



}