package com.ibit.controllers;

import com.ibit.models.Book;
import com.ibit.models.WebCounter;
import com.ibit.repository.WebCounterRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class BookQueryResolver implements GraphQLQueryResolver {

    WebCounterRepository webCounterRepository;

    @Autowired
    public BookQueryResolver(WebCounterRepository webCounterRepository) {
        this.webCounterRepository = webCounterRepository;
    }

    public Book findBookById(String id) {
        // For simplicity, returning a mock book. Replace this with actual data fetching logic.
        return new Book(id, "Sample Book Title", "Sample Author");
    }

    public Optional<WebCounter> findWebCounterById(String siteName) {
        return this.webCounterRepository.findById(siteName);
    }
}
