package io.jpelczar.structural.facade;

public class BankAccount {
    public boolean take(int amount, String user) {
        UserService userService = new UserService();
        if (!userService.isExist(user)) {
            return false;
        }

        AccountService accountService = new AccountService();
        if (accountService.isAvailable(amount)) {
            accountService.get(amount);
            return true;
        }

        DebitService debitService = new DebitService();
        if (debitService.isAvailable(amount)) {
            debitService.get(amount);
            return true;
        }

        return false;
    }
}
