package com.example.aopstudy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class AppRunner implements ApplicationRunner {


	@Override
	public void run(ApplicationArguments args) throws Exception {

		log.info("start my app! with");





	}
}
