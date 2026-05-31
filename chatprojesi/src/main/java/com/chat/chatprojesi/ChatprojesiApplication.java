package com.chat.chatprojesi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@EntityScan("model")
@ComponentScan(basePackages = {"com.chat.chatprojesi", "controller", "service", "repository"})
@EnableJpaRepositories(basePackages = "repository")
public class ChatprojesiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ChatprojesiApplication.class, args);}}