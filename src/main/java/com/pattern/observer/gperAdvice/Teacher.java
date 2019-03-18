package com.pattern.observer.gperAdvice;

import java.util.Observable;
import java.util.Observer;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 10:06
 * @Version 1.0
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        GPer gper = (GPer) o;
        Question question = (Question) arg;
        System.out.println("-----------------");
        System.out.println(name + "老师，你好！\n" +
                "您收到了一个来自“" + gper.getName() + "”的提问：" +
                question.getContent() + "\n" +
                "提问者：" + question.getUserName());
    }
}
