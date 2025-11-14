package com.zeeshan.AliceAndHerBackery;


import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.type", havingValue = "chocolate")
public class ChocolateFrosting implements Frosting{
    @Override
    public void getFrostingType() {
        System.out.println("this is chocolate frosting");
    }
}
