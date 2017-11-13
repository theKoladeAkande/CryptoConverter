package com.example.thekoladeakande.cryptoconverter;

/**
 * Created by thekoladeakande on 11/4/17.
 */import com.example.thekoladeakande.cryptoconverter.BtcActivity;
import com.google.gson.annotations.SerializedName;

public class CurrencyValue {


    public CurrencyValue(double NGN, double USD) {
        this.NGN= NGN;
       this.USD = USD;
    }



    @SerializedName("USD")
    private double USD;

    @SerializedName("NGN")
    private double NGN;

    @SerializedName("GBP")
    private double GBP;




    @SerializedName("AUD")
    private double AUD;

    @SerializedName("CNY")
    private double CNY;

    @SerializedName("KRW")
    private double KRW;

    @SerializedName("JPY")
    private double JPY;

    @SerializedName("DMK")
    private double DMK;

    @SerializedName("RUB")
    private double RUB;

    @SerializedName("SAR")
    private double SAR;

    @SerializedName("GHS")
    private double GHS;

    @SerializedName("QAR")
    private double QAR;

    @SerializedName("NLG")
    private double NLG;

    @SerializedName("ITL")
    private double ITL;

    @SerializedName("HKD")
    private double HKD;

    public double getCHF() {
        return CHF;
    }

    @SerializedName("CHF")
    private double CHF;

    public double getEUR() {
        return EUR;
    }

    @SerializedName("EUR")
    private double EUR;

    public double getHKD() {
        return HKD;
    }

    public double getUSD() {
        return USD;
    }

    public double getNGN() {
        return NGN;
    }

    public double getGBP() {
        return GBP;
    }

    public double getAUD() {
        return AUD;
    }

    public double getCNY() {
        return CNY;
    }

    public double getKRW() {
        return KRW;
    }

    public double getJPY() {
        return JPY;
    }

    public double getDMK() {
        return DMK;
    }

    public double getRUB() {
        return RUB;
    }

    public double getSAR() {
        return SAR;
    }

    public double getGHS() {
        return GHS;
    }

    public double getQAR() {
        return QAR;
    }

    public double getNLG() {
        return NLG;
    }

    public double getITL() {
        return ITL;
    }

    public double getILS() {
        return ILS;
    }

    public double getESP() {
        return ESP;
    }

    public double getZAR() {
        return ZAR;
    }

    @SerializedName("ILS")
    private double ILS;

    @SerializedName("ESP")
    private double ESP;

    @SerializedName("ZAR")
    private double ZAR;

}
