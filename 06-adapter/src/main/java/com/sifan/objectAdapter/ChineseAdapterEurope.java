package com.sifan.objectAdapter;

public class ChineseAdapterEurope implements ChineseSocket {

    private EuropeSocket europeSocket;

    public ChineseAdapterEurope(EuropeSocket europeSocket) {
        this.europeSocket = europeSocket;
    }

    @Override
    public String useChineseSocket() {
        System.out.println("使用转换器转换完成");
        return europeSocket.useEuropeSocket();
    }
}
