package com.example.thekoladeakande.cryptoconverter;

/**
 * Created by thekoladeakande on 11/4/17.
 */import com.example.thekoladeakande.cryptoconverter.BtcActivity;
import com.google.gson.annotations.SerializedName;

public class CurrencyValue{

    public CurrencyValue(double BTC, double value) {
        this.BTC = BTC;
        Value = value;
    }
     private  double remiander;
    @SerializedName("BTC")
    private double BTC;

    @SerializedName("USD")
    private double Value;

    private double NGN;


   public double getBTC() {
        return BTC;
    }


    public double getValue() {
        return Value;
    }


    public double getNGN () {
        return NGN;
    }
}