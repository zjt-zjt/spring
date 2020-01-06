package com.lanou.factory;


import com.lanou.Women;

/**
 * 实例工厂
 */
public class WomenFactory {

    public Women newInstance(String name) {

        return new Women(name);
    }
}
