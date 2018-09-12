package io.jpelczar.structural.facade;

public class DebitService {

    private int mockDebit = 0;

    public boolean isAvailable(int amount) {
        int availableDebit = 100;
        return amount < availableDebit - mockDebit;
    }

    public void get(int amount) {
        mockDebit -= amount;
    }
}
