package com.lanou.bean;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Food {
    private String name;

    @Override
    public String toString() {
        return this.getName();
    }
}
