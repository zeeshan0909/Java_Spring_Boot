package com.zeeshan.AliceAndHerBackery;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.type", havingValue = "strawberry")
public class StrawberrySyrup implements Syrup{
    @Override
    public void getSyrupType() {
        System.out.println("this is strawberry syrup");
    }
}
