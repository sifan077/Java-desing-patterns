package com.sifan;

public class MediatorPatternDemo {
   public static void main(String[] args) {
       // 创建中介者
       ChatRoom chatRoom = new ChatRoom();
       
       // 创建用户
       User robert = new User("Robert");
       User john = new User("John");

       // 通过中介者发送消息
       robert.sendMessage("Hi! John!", chatRoom);
       john.sendMessage("Hello! Robert!", chatRoom);
   }
}