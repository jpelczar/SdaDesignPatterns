package io.jpelczar.behavioral.nullobject;

import java.util.Collections;

public class NullPizza extends Pizza {

    public NullPizza() {
        this.setIngredients(Collections.emptyList());
        this.setPrice(-1);
        this.setName("");
    }
}
