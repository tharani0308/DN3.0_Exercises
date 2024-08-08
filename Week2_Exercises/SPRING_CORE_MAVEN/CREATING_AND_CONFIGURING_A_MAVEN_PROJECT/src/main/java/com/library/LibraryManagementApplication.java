package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        // Load the Spring context from XML configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Check if the bookRepository is properly injected
        if (bookService != null && bookService.getBookRepository() != null) {
            System.out.println("Dependency Injection successful!");
        } else {
            System.out.println("Dependency Injection failed.");
        }
    }
}
