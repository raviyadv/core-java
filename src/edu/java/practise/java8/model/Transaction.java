package edu.java.practise.java8.model;

import java.util.Objects;

public class Transaction {
    private int amount;
    private String currency;
    private String country;
    private String purpose;

    public Transaction(int amount, String currency, String country, String purpose) {
        this.amount = amount;
        this.currency = currency;
        this.country = country;
        this.purpose = purpose;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                ", country='" + country + '\'' +
                ", purpose='" + purpose + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return amount == that.amount &&
                currency.equals(that.currency) &&
                country.equals(that.country) &&
                purpose.equals(that.purpose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency, country, purpose);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
