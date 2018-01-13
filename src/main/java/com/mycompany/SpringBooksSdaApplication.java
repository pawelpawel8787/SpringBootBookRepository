package com.mycompany;

import com.mycompany.model.Category;
import com.mycompany.service.AuthorServiceImpl;
import com.mycompany.service.BookServiceImpl;
import com.mycompany.service.CategoryServiceImpl;
import com.mycompany.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBooksSdaApplication implements CommandLineRunner{
	@Autowired
	private AuthorServiceImpl authorService;
	@Autowired
	private BookServiceImpl bookService;
	@Autowired
	private CategoryServiceImpl categoryService;
	@Autowired
	private PublisherServiceImpl publisherService;


	public static void main(String[] args) {
		SpringApplication.run(SpringBooksSdaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Category category1 = new Category();
		category1.setName("fanstasy");

		categoryService.


	}
}
