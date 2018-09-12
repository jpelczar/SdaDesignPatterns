package io.jpelczar.behavioral.chain;

public class AddFiveHandler extends Handler {

    @Override
    Integer operation(Integer input) {
        return input + 5;
    }
}
