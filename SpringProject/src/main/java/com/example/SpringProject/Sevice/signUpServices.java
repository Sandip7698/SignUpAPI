package com.example.SpringProject.Sevice;

import com.example.SpringProject.dto.SignUpdto;
import org.springframework.http.ResponseEntity;


public interface signUpServices {
    ResponseEntity<String> saveinfo(SignUpdto signUpdto);
}
