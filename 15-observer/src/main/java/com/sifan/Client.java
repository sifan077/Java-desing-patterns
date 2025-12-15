package com.sifan;

class Client {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        subject.addObserver(() -> System.out.println("A同学您的APP需要更新"));
        subject.addObserver(() -> System.out.println("B同学您的APP需要更新"));
        subject.addObserver(() -> System.out.println("C同学您的APP需要更新"));
        subject.notifyObservers();
    }
}