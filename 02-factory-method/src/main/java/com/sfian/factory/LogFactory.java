package com.sfian.factory;

import com.sfian.product.Log;

/**
 * 日志工厂,顶级父类接口
 *
 * @author 思凡
 * @date 2023/03/26
 */
public interface LogFactory {
    Log createLog();
}
