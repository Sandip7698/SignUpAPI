package com.example.SpringProject.Controller;

import com.example.SpringProject.Sevice.signUpServices;
import com.example.SpringProject.dto.SignUpdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignUpController {
    @Autowired
    com.example.SpringProject.Sevice.signUpServices signUpServices;
    @PostMapping("/saveinfo")
    public ResponseEntity<String> save(@RequestBody SignUpdto signUpdto){
        return signUpServices.saveinfo(signUpdto);
    }

    
}
