package com.sifan;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements AbstractSubject {

    List<AbstractObserver> list = new ArrayList<>();

    @Override
    public void addObserver(AbstractObserver observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(AbstractObserver observer) {
        list.remove(observer);
    }

    @Override
    public void notification() {
        for (AbstractObserver abstractObserver : list) {
            abstractObserver.update();
        }
    }
}