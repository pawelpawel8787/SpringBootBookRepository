package com.mycompany;

import com.mycompany.model.Author;
import com.mycompany.model.Book;
import com.mycompany.model.Category;
import com.mycompany.model.Publisher;
import com.mycompany.repository.AuthorRepository;
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
	private AuthorRepository authorRepository;
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

//		Category category1 = new Category();
//		category1.setName("przygodowa");
//
//		categoryService.createCategory(category1);
//
//		Author author1 = new Author();
//		author1.setAddress("Urocza 9");
//		author1.setLastname("Jana");
//		author1.setName("Niezbedny");
//
//		authorService.createAuthor(author1);
//
//		Publisher publisher1 = new Publisher();
//		publisher1.setName("Laura");
//		publisher1.setAddress("Lesna 2");
//
//		publisherService.createPublisher(publisher1);
//
//		Book book1 = new Book();
//		book1.setAuthor("AutorKsiazki2");
//		book1.setTitle("bezsennosc");
//		book1.setBookAuthor(author1);
//		book1.setCategory(category1);
//		book1.setPublisher(publisher1);
//
//		bookService.createBook(book1);

//		Author author2 = authorRepository.findById(1);
//
//		Book book2 = new Book();
//		book2.setAuthor("Zenon");
//		book2.setTitle("LALALa");
//		book2.setBookAuthor(author2);
//
//		bookService.createBook(book2);

	}
}
