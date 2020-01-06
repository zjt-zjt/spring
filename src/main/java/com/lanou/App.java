package com.lanou;

import com.lanou.bean.Man;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        //test();
        //womenFactory();
        //womenStaticFactory();
        //initAndDestroy();
        lazy();
        //testScope();
    }

    public static void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        Man man = ctx.getBean(Man.class);
        System.out.println(man);
        man.eat();
        man.play();

    }

    public static void womenFactory() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        Women women = ctx.getBean("zhangsan", Women.class);
        System.out.println(women);
        System.out.println(women.getName());
    }

    public static void womenStaticFactory() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        Women women = ctx.getBean("zhao", Women.class);
        System.out.println(women);
        System.out.println(women.getName());
    }

    public static void initAndDestroy() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        ctx.registerShutdownHook();
        Man man = ctx.getBean("caiwenji", Man.class);
        System.out.println(man.getName());

    }


    public static void lazy() {
        //利用 ClassPathXmlApplicationContext或ConfigurableApplicationContext才能调用优雅的关闭IOC的方法registerShutdownHook();
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");
        ctx.registerShutdownHook();

//        Man man= ctx.getBean("kai",Man.class);
//        System.out.println(man.getName());

    }

    public static void testScope() {
        // 1. 加载Spring上下文配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/applicationContext.xml");

        for (int i = 0; i < 10; i++) {
            System.out.println("当前第" + (i + 1) + "次获取man对象");
            Man man = ctx.getBean("man", Man.class);
            System.out.println("当前man的名称：" + man.getName() + ", 年龄： " + man.getAge());
            man.setAge(i + 1);
            System.out.println("修改完年龄以后，man的名称：" + man.getName() + ", 年龄： " + man.getAge());
            System.out.println(man);
            System.out.println("----------------------------------------------");
            System.out.println("\n\n");
        }
    }


}
