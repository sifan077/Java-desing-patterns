package com.sfian.factory;

import com.sfian.product.DatabaseLog;
import com.sfian.product.Log;

public class DatabaseLogFactory implements LogFactory {
    @Override
    public Log createLog() {
        return new DatabaseLog();
    }
}
