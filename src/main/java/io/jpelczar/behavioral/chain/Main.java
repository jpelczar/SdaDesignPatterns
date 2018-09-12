package io.jpelczar.behavioral.chain;

public class Main {
    public static void main(String[] args) {
        Handler multiplyByTwoHandler = new MultiplyByTwoHandler();
        Handler addFiveHandler = new AddFiveHandler();
        Handler divideByTwoHandler = new DivideByTwoHandler();

        addFiveHandler.setNext(divideByTwoHandler);
        multiplyByTwoHandler.setNext(addFiveHandler);
        System.out.println("Result = " + multiplyByTwoHandler.execute(11));
    }
}
