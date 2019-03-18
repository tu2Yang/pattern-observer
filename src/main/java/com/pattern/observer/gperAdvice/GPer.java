package com.pattern.observer.gperAdvice;

import java.util.Observable;

/**
 * @Description
 * jdk提供的一种观察者实现方式
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 10:00
 * @Version 1.0
 */
public class GPer extends Observable {

    private String name = "GPer生态圈";

    private static GPer gper = null;

    private GPer() {}

    public static GPer getInstance() {
        if(null == gper) {
            gper = new GPer();
        }
        return gper;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question) {
        System.out.println(question.getUserName() + "在" + this.name + "上发布了：" + question.getContent());
        setChanged();
        notifyObservers(question);
    }
}
