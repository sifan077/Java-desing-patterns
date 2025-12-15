package com.sifan.product;

/**
 * 数据库日志
 *
 * @author 思凡
 * @date 2023/03/26
 */
public class DatabaseLog  implements Log {
    @Override
    public void writeLog() {
        System.out.println("==========数据库日志已经写入=======");
    }
}
