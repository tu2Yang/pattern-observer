package com.pattern.observer.guavaGper;

import com.google.common.eventbus.Subscribe;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 10:34
 * @Version 1.0
 */
public class GuavaTeacher {

    @Subscribe
    public void receiveQuestion(GuavaQuestion question) {
        System.out.println("-----------------");
        System.out.println(question.getAnswerName() + "老师，你好！\n" +
                "您收到了一个来自“" + question.getPublishPlace() + "”的提问：" +
                question.getContent() + "\n" +
                "提问者：" + question.getAskName());
    }

}
