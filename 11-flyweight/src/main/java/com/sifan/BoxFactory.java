package com.sifan;

import java.util.HashMap;

public class BoxFactory {

    private static HashMap<String, AbstractBox> map;

    // 在构造方法中进行初始化操作
    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
    }

    //提供一个方法获取工厂类对象
    public static final BoxFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    // 静态内部类的方式来实现单例模式
    private static class SingletonHolder {
        private static final BoxFactory INSTANCE = new BoxFactory();
    }

    //根据名字获取图形对象
    public AbstractBox getBox(String key) {
        return map.get(key);
    }
}
