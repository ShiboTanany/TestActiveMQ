package com.testmessaging.net;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Controller;

import javax.print.DocFlavor;

@Controller
public class Person1 {

    @Autowired
    private JmsTemplate jmsTemplate;

    @JmsListener(destination = "person1", containerFactory = "myFactory")
    public void receiveMessage1(String email) {
        System.out.println("Received from person1  <" + email + ">");
    }

    public void send(String message){
        jmsTemplate.convertAndSend("person2",message);
    }

}
