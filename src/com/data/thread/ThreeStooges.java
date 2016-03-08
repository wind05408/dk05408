package com.data.thread;

import java.util.HashSet;
import java.util.Set;

/**
 * @author dk
 * @date 2016/1/25
 */
public final class ThreeStooges {
    private final Set<String> stooges  = new HashSet<>();

    public ThreeStooges(){
        stooges.add("Moe");
        stooges.add("Larry");
        stooges.add("Curly");
    }

    public boolean isStooge(String name) {
        return stooges.contains(name);
    }
}
