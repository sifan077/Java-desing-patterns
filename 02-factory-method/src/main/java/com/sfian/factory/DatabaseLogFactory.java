package com.sifan.factory;

import com.sifan.product.DatabaseLog;
import com.sifan.product.Log;

public class DatabaseLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        return new DatabaseLog();
    }
}
