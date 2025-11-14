package com.zeeshan.AliceAndHerBackery;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CakeBaker {

    @Autowired
    Syrup syrup;

    @Autowired
    Frosting frosting;

    public void backCake(){
        frosting.getFrostingType();
        syrup.getSyrupType();

        System.out.println("your cake is ready");
    }
}
