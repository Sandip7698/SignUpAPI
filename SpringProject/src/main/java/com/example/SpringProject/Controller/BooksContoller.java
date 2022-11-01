package com.example.SpringProject.Controller;

import com.example.SpringProject.Dao.BooksRepository;
import com.example.SpringProject.Model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class BooksContoller {
    @Autowired
    BooksRepository booksRepository;

    @PostMapping("save")
    public String insert(@RequestBody Books books){
        booksRepository.save(books);
        return "Saved....";

    }
}
