package com.manoel.gametrackerapi;

import org.springframework.boot.SpringApplication;

public class TestGameTrackerApiApplication {

	public static void main(String[] args) {
		SpringApplication.from(GameTrackerApiApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
