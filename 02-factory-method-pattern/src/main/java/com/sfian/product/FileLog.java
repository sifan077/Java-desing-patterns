package com.sfian.product;

/**
 * 文件日志
 *
 * @author 思凡
 * @date 2023/03/26
 */
public class FileLog implements Log{
    @Override
    public void writeLog() {
        System.out.println("==========文件日志已经写入========");
    }
}
