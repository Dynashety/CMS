package com.zizo.object;

import java.util.*;

/**
 * Created by dengy on 2016/6/27.
 */
public class Record {
    private Map m = new HashMap();

    public Map get() {
        return m;
    }

    public Record set(String key, Object val) {
        m.put(key,val);
        return this;
    }

    public Record() {
    }
}