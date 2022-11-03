package com.example.SpringProject.Dao;

import com.example.SpringProject.Model.SignUp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface signUpRepository extends JpaRepository<SignUp,Long> {

    Optional<SignUp> getByfirstName(String firstName);

    Optional<SignUp> findBylastName(String lastName);

    Optional<SignUp> findByuserName(String userName);

    Optional<SignUp> findByemail(String email);

    Optional<SignUp> findByContact(Long contact);

    SignUp getByuserId(Long userId);

    Optional<SignUp> findByFirstName(String firstName);

    Optional<SignUp> findByLastName(String lastName);
}
