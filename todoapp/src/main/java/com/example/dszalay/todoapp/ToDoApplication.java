package com.example.dszalay.todoapp;

import com.example.dszalay.todoapp.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ToDoApplication implements CommandLineRunner{

	@Autowired
	Repository repository;

	public static void main(String[] args) {
		SpringApplication.run(ToDoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
