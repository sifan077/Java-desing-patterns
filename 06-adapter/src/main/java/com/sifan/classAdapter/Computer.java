package com.sifan.classAdapter;

public class Computer {

    public String useChineseSocket(ChineseSocket chineseSocket) {
        if (chineseSocket == null) {
            throw new NullPointerException("sd card null");
        }
        return chineseSocket.useChineseSocket();
    }
}
