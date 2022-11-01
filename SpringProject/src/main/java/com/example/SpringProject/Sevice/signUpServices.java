package com.example.SpringProject.Sevice;

import com.example.SpringProject.Model.SignUp;
import com.example.SpringProject.dto.SignUpdto;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;


public interface signUpServices {
    ResponseEntity<String> saveinfo(SignUpdto signUpdto);
  Optional<SignUp> getById(Long userId);
}
