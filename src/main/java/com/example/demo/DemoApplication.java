package com.example.demo;

import com.example.demo.user.model.entity.UserEntity;
import com.example.demo.user.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

//    @Bean
//    CommandLineRunner init(UserRepository userRepository) {
//        return args -> {
////            Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
////                UserEntity user = new UserEntity(name, name.toLowerCase() + "yan",1, name.toLowerCase() + "@domain.com");
////                userRepository.save(user);
////            });
//            userRepository.findAll().forEach(System.out::println);
//        };
//    }

}
