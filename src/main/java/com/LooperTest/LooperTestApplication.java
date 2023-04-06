package com.LooperTest;

import com.LooperTest.repository.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@SpringBootApplication(scanBasePackages = "com/LooperTest")
public class LooperTestApplication implements org.springframework.boot.ApplicationRunner {

	private final UserRepo userRepo;

	public static void main(String[] args) {
		new SpringApplicationBuilder().sources(LooperTestApplication.class).bannerMode(Banner.Mode.OFF).run(args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("--------Result--------");
		userRepo.findAll().stream().toList().forEach(System.out::println);
		System.out.println("----------------------");
	}
}
