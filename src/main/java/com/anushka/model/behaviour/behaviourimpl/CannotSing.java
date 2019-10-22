package com.anushka.model.behaviour.behaviourimpl;

import com.anushka.model.behaviour.Singable;

public class CannotSing implements Singable {
    public String sing() {
        return "I can't sing";
    }
}
