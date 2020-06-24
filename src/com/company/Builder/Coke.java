package com.company.Builder;

import com.company.Prototype.ColorStore;

public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 8.0f;
    }
}
