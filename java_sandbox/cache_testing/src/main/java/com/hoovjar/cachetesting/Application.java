package com.hoovjar.cachetesting;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hoovjar.cachetesting.repositories.BookRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	private BookRepository bookRepository;

	@Override
	public void run(String... args) throws Exception {
		log.info("... Fetching books");
		log.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
		log.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
		log.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
		log.info("isbn-4567 -->" + bookRepository.getByIsbn("isbn-4567"));
		log.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
		log.info("isbn-1234 -->" + bookRepository.getByIsbn("isbn-1234"));
	}

}
