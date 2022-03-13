package com.company;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void deposit(double sum){
        amount += sum;
        System.out.println("Вы пополнили счет на: "+ getAmount()+"Com");
    }
    public void withDraw(Integer sum) throws LimitException{
        if (sum > amount){
            throw new LimitException("Ne dostatochno sredstv ", amount);
        }
        else {
            amount-= sum;
            System.out.println("vy snyali"+sum+ "\nostatok "+ amount);
        }
    }
}
