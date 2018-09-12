package io.jpelczar.behavioral.chain;

public class MultiplyByTwoHandler extends Handler {

    @Override
    Integer operation(Integer input) {
        return input * 2;
    }
}
