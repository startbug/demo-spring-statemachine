package com.ggs.statemachine.demo2.config;


import java.util.EnumSet;

import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.EnumStateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;

import com.ggs.statemachine.demo2.enums.Events;
import com.ggs.statemachine.demo2.enums.States;

@Configuration
@EnableStateMachine
public class Config1Enums extends EnumStateMachineConfigurerAdapter<States, Events> {

    @Override
    public void configure(StateMachineStateConfigurer<States, Events> states) throws Exception {
        states
                .withStates()
                .initial(States.S1)
                .end(States.SF)
                .states(EnumSet.allOf(States.class));
    }

}
