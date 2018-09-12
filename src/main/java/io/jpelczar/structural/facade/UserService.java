package io.jpelczar.structural.facade;

public class UserService {

    public boolean isExist(String name) {
        return "John".equalsIgnoreCase(name);
    }

}
