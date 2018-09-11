package io.jpelczar.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println(StrategyContext.executeStrategy(new OperationAdd(), 5, 14));
        System.out.println(StrategyContext.executeStrategy(new OperationSubstract(), 99, 14));
        System.out.println(StrategyContext.executeStrategy(new OperationAdd(), 51, 11));
    }
}
