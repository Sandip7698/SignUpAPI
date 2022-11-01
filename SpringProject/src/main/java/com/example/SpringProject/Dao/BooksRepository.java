package com.example.SpringProject.Dao;

import com.example.SpringProject.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books,Integer> {
}
