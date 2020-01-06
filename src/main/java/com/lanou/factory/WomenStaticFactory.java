package com.lanou.factory;

import com.lanou.Women;


/**
 * 静态工厂
 */
public class WomenStaticFactory {
    public static Women newInstance(String name) {

        return new Women(name);
    }
}
