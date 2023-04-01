package com.sifan.classAdapter;

/**
 * 定义适配器类 中国双叉转为欧洲三叉
 *
 */
public class ChineseAdapterEurope extends EuropeSocketImpl implements ChineseSocket {

    @Override
    public String useChineseSocket() {
        System.out.println("使用转换器转换完成");
        return useEuropeSocket();
    }
}