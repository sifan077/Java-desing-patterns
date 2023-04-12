package com.sifan;

public interface AbstractSubject {
    void addObserver(AbstractObserver observer);
    void removeObserver(AbstractObserver observer);
    void notification();
}