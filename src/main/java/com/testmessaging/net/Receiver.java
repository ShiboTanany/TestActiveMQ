package com.testmessaging.net;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

//    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
//    public void receiveMessage(Email email) {
//        System.out.println("Received <" + email + ">");
//    }
    @JmsListener(destination = "mailbox", containerFactory = "myFactory")
    public void receiveMessage1(String email) {
        System.out.println("Received <" + email + ">");
    }
}