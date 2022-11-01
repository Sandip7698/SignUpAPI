package com.example.SpringProject.Sevice;

import com.example.SpringProject.Dao.BooksRepository;
import com.example.SpringProject.Model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BooksService {


    public class BooksServices {
        @Autowired
        BooksRepository booksRepository;
        List<Books> books = new ArrayList<Books>();

        public List<Books> getAllBooks() {

            booksRepository.findAll();
            return books;

        }

        public Books getBooksById(int id) {
            return booksRepository.getReferenceById(id);
        }

        public void save(Books books) {
            booksRepository.save(books);
        }

        public void delete(int id) {
            booksRepository.deleteById(id);
        }

        public void update(Books books, int bookid) {
            booksRepository.save(books);
        }

    }
}