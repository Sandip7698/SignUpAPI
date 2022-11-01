package com.example.SpringProject.Controller;

import com.example.SpringProject.Model.SignUp;
import com.example.SpringProject.dto.SignUpdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class SignUpController {
    @Autowired
    com.example.SpringProject.Sevice.signUpServices signUpServices;
    @PostMapping("/saveinfo")
    public ResponseEntity<String> save(@RequestBody SignUpdto signUpdto){
        return signUpServices.saveinfo(signUpdto);
    }

    @GetMapping("/findById/{userId}")
    public Optional<SignUp> getByid(@PathVariable ("userId")Long userId){
        return signUpServices.getById(userId);
    }
    @GetMapping("/findByfirstName/{firstName}")
    public Optional<SignUp> getByfirstName(@PathVariable("firstName")String firstName){
        return signUpServices.getByfirstName(firstName);
    }

    @GetMapping("/findBylastName/{lastName}")
    public Optional<SignUp>getBylastName(@PathVariable ("lastName")String lastName){
        return signUpServices.getBylastName(lastName);
    }
}
