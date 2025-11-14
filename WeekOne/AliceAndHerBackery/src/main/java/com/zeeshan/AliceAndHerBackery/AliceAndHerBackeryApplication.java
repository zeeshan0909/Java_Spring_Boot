package com.zeeshan.AliceAndHerBackery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AliceAndHerBackeryApplication implements CommandLineRunner {

    @Autowired
    CakeBaker CakeBaker;

	public static void main(String[] args) {
		SpringApplication.run(AliceAndHerBackeryApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        CakeBaker.backCake();
    }
}
