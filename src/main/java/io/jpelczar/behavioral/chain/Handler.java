package io.jpelczar.behavioral.chain;

public abstract class Handler {

    private Handler nextHandler;

    void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    Integer execute(Integer input) {
        Integer result = operation(input);
        if (nextHandler != null) {
            return nextHandler.execute(result);
        }

        return result;
    }

    abstract Integer operation(Integer input);
}
