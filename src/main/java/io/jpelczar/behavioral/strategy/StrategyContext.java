package io.jpelczar.behavioral.strategy;

public class StrategyContext {
    public static int executeStrategy(Strategy strategy, int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
