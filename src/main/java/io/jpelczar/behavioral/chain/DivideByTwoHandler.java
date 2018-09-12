package io.jpelczar.behavioral.chain;

public class DivideByTwoHandler extends Handler {

    @Override
    Integer operation(Integer input) {
        return input / 2;
    }
}
