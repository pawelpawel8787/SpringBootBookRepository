package com.mycompany.controller;


import com.mycompany.model.Book;
import com.mycompany.service.AuthorServiceImpl;
import com.mycompany.service.BookServiceImpl;
import com.mycompany.service.CategoryServiceImpl;
import com.mycompany.service.PublisherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class WebController {

    @Autowired
    private BookServiceImpl bookService;

    @Autowired
    private AuthorServiceImpl authorService;

    @Autowired
    private CategoryServiceImpl categoryService;

    @Autowired
    private PublisherServiceImpl publisherService;

    @GetMapping("/books")
    public ModelAndView showBooks(){
        ModelAndView model = new ModelAndView();
        model.addObject("books", bookService.getAllBooks());
//        model.addObject("authors", authorService.getAllAuthors());

        model.addObject("categories", categoryService.getAllCategory());
        model.addObject("publishers", publisherService.getAllPublisher());
        model.addObject("book", new Book());
        model.setViewName("bookList");
        return model;
    }

    @GetMapping("/authors")
    public ModelAndView showAutors(){
        ModelAndView model = new ModelAndView();
        model.addObject("authors", authorService.getAllAuthors());
        model.setViewName("authorsList");
        return model;
    }

    @GetMapping("/category")
    public ModelAndView showCategories(){
        ModelAndView model = new ModelAndView();
        model.addObject("category", categoryService.getAllCategory());
        model.setViewName("categoryList");
        return model;
    }

    @GetMapping("/publisher")
    public ModelAndView showPublishers(){
        ModelAndView model = new ModelAndView();
        model.addObject("publisher", publisherService.getAllPublisher());
        model.setViewName("publisherList");
        return model;
    }

    @PostMapping(value = "addbook")
    public String addBook(@ModelAttribute ("book")
                          @Valid Book book,
                                BindingResult bookResult,
                                RedirectAttributes redirectAttributes){
        bookService.createBook(book);
        redirectAttributes
                .addFlashAttribute("message", "Successfully added...");

        return "redirect:/books";
    }





}
