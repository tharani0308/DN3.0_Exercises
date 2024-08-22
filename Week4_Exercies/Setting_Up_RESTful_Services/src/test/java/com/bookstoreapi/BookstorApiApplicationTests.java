package com.bookstoreapi;

import com.bookstoreapi.controller.BookController;
import com.bookstoreapi.controller.AuthorController;
import com.bookstoreapi.controller.CustomerController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookstoreApiApplicationTests {

    @Autowired
    private BookController bookController;

    @Autowired
    private AuthorController authorController;

    @Autowired
    private CustomerController customerController;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void contextLoads() {
        // Verifies that the controllers are loaded into the application context
        assertThat(bookController).isNotNull();
        assertThat(authorController).isNotNull();
        assertThat(customerController).isNotNull();
    }

    @Test
    void testGetBooks() {
        // Test that the GET /books endpoint returns a 200 OK status
        ResponseEntity<String> response = restTemplate.getForEntity("/books", String.class);
        assertThat(response.getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    void testGetAuthors() {
        // Test that the GET /authors endpoint returns a 200 OK status
        ResponseEntity<String> response = restTemplate.getForEntity("/authors", String.class);
        assertThat(response.getStatusCodeValue()).isEqualTo(200);
    }

    @Test
    void testGetCustomers() {
        // Test that the GET /customers endpoint returns a 200 OK status
        ResponseEntity<String> response = restTemplate.getForEntity("/customers", String.class);
        assertThat(response.getStatusCodeValue()).isEqualTo(200);
    }
}
