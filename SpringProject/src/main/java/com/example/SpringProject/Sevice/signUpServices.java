package com.example.SpringProject.Sevice;

import com.example.SpringProject.Model.SignUp;
import com.example.SpringProject.dto.SignUpdto;
import org.springframework.http.ResponseEntity;


import java.util.List;
import java.util.Optional;


public interface signUpServices {
    ResponseEntity<String> saveinfo(SignUpdto signUpdto);
  Optional<SignUp> getById(Long userId);

  Optional<SignUp> getByfirstName(String firstName);

    Optional<SignUp> getBylastName(String lastName);

    Optional<SignUp> findByuserName(String userName);

    Optional<SignUp> findByemail(String email);

    Optional<SignUp> findByContact(Long contact);

    ResponseEntity<String> deleteById(Long userId);

    List<SignUp> allinfo();

    ResponseEntity<String> updatedata(Long userId, SignUpdto signUpdto);
}
