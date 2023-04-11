package com.sifan;

public class MediatorPatternDemo {
   public static void main(String[] args) {
      User robert = new User("Robert");
      User john = new User("John");

      System.out.println(robert.sendMessage("Hi! John!"));
      System.out.println(john.sendMessage("Hello! Robert!"));
   }
}