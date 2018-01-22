package com.testmessaging.net;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Person2 {

//    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
//    public void receiveMessage(Email email) {
//        System.out.println("Received <" + email + ">");
//    }
@Autowired
private JmsTemplate jmsTemplate;

    @JmsListener(destination = "person2", containerFactory = "myFactory")
    public void receiveMessage1(String email) {
        System.out.println("Received from person2  <" + email + ">");
    }

    public void send(String message){
        jmsTemplate.convertAndSend("person1",message);
    }
}