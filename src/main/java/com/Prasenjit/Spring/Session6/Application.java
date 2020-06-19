package com.Prasenjit.Spring.Session6;

import com.Prasenjit.Spring.Session6.Models.BookGenre;
import com.Prasenjit.Spring.Session6.Models.Books;
import com.Prasenjit.Spring.Session6.Repositories.BookGenreRepository;
import com.Prasenjit.Spring.Session6.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Autowired
	BookRepository bookRepository;

	@Autowired
	BookGenreRepository bookGenreRepository;

	@Override
	public void run(String ... args) throws Exception
	{
		Books b1 = new Books(200, "Immortals of Meluha", "Amish Tripathi");
		Books b2 = new Books(230, "Angels and Demons", "Dan Brown");

		List<Books> l= new ArrayList<>();
		l.add(b1);
		l.add(b2);
		//bookRepository.saveAll(l);

		BookGenre bG1= new BookGenre("Fiction", l);
		BookGenre bG2 = new BookGenre("Non Fiction");
		bookGenreRepository.save(bG1);
		bookGenreRepository.save(bG2);

		bookRepository.saveAll(l);
		System.out.println(bookRepository.findAll());
		System.out.println(bookRepository.findById(1));


		System.out.println(bookGenreRepository.findAll());
	}
}
