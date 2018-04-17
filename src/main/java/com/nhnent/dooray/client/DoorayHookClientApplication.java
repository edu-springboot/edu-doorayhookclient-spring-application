package com.nhnent.dooray.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class DoorayHookClientApplication {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(DoorayHookClientApplication.class);
        DoorayHookSender doorayHookSender = context.getBean(DoorayHookSender.class);

        DoorayHook doorayHook = new DoorayHook();
        doorayHook.setBotName("test");
        doorayHook.setText("test!!");
        doorayHookSender.send(doorayHook);
    }
}
