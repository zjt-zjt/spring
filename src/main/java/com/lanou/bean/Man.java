package com.lanou.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Man {

    private String name;
    private int age;
    private String gender;
    //    private String food;
    private String hobby;
    private Food food;

    public Man() {
    }

    public Man(String name, int age, String gender, String hobby, Food food) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
        this.food = food;
    }

    public void eat() {
        System.out.println("我是" + name + ",我今年" + age + "岁了,我喜欢吃：" + food);
    }

    public void play() {
        System.out.println("我是" + name + ",我今年" + age + "岁了,我喜欢：" + hobby);
    }

    public void init() {
        System.out.println("man对象初始化, " + this.getName());
    }

    public void destroy() {
        System.out.println("man对象销毁, " + this.getName());
    }

}
