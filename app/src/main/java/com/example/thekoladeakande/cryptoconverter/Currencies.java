package com.example.thekoladeakande.cryptoconverter;

/**
 * Created by thekoladeakande on 11/5/17.
 */

public class Currencies {

    private String Abb;

    public Currencies(String currency, String abb) {
        Abb = abb;
        Currency = currency;
    }

    private String  Currency;

    public void setAbb(String abb) {
        Abb = abb;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public String getAbb() {
        return Abb;
    }

    public String getCurrency() {
        return Currency;
    }
}
