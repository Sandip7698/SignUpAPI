package com.example.SpringProject.Dao;

import com.example.SpringProject.Model.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface signUpRepository extends JpaRepository<SignUp,Long> {

}
