package com.pattern.observer.gperAdvice;

/**
 * @Description
 * @Auther tuyangyang
 * @Date 2019/3/18 0018 下午 10:11
 * @Version 1.0
 */
public class ObserverTest {

    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");

        Question question = new Question();
        question.setUserName("Yang");
        question.setContent("明天早上吃什么");
        gper.addObserver(tom);
        gper.addObserver(mic);
        gper.publishQuestion(question);
    }

}
