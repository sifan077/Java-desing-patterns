package com.sifan.factory;

import com.sifan.product.FileLog;
import com.sifan.product.Log;

/**
 * 文件日志工厂
 *
 * @author 思凡
 * @date 2023/03/26
 */
public class FileLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        return new FileLog();
    }
}
