package com.ggs.statemachine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.statemachine.StateMachine;

import com.ggs.statemachine.demo1.enums.Events;
import com.ggs.statemachine.demo1.enums.States;

@SpringBootApplication
public class DemoSpringStatemachineApplication implements CommandLineRunner {

    @Autowired
    private StateMachine<States, Events> stateMachine;

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringStatemachineApplication.class, args);
    }


    // demo2 =========================================================== begin


    // demo2 =========================================================== end

    // demo1 =========================================================== begin
    @Override
    public void run(String... args) throws Exception {
        stateMachine.sendEvent(Events.E1);
        stateMachine.sendEvent(Events.E2);
    }
    // demo2 =========================================================== end

}
