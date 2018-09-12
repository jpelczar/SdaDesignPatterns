package io.jpelczar.structural.facade;

public class AccountService {

    private int mockAmount = 1000;

    public boolean isAvailable(int amount) {
        return amount <= mockAmount;
    }

    public void get(int amount) {
        mockAmount -= amount;
    }
}
