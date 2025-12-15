package com.sifan;

/**
 * 代理图片 - 延迟加载实现
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        return realImage.display();
    }
}