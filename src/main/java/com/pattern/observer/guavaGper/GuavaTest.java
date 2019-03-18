package com.pattern.observer.guavaGper;

import com.google.common.eventbus.EventBus;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 10:48
 * @Version 1.0
 */
public class GuavaTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaTeacher guavaGper = new GuavaTeacher();
        eventBus.register(guavaGper);
        GuavaQuestion question = new GuavaQuestion();
        question.setAskName("Younger");
        question.setAnswerName("Tom");
        question.setContent("Guava这东西有点牛逼");
        question.setPublishPlace("GPer社区");
        eventBus.post(question);
    }

}
