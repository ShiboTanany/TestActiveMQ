package com.testmessaging.net;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.ws.RequestWrapper;

@Controller
@RequestMapping("/send")
public class SendingMessages {

    @Autowired
    Person1 person1;

    @Autowired
    Person2 person2;

    @RequestMapping("/{message}")
    public void SendMessage(@PathVariable("message")  String message){
        person1.send(message);

    }
    @RequestMapping("/person2/{message}")
    public void SendMessage2(@PathVariable("message")  String message){
        person2.send(message);

    }

}
