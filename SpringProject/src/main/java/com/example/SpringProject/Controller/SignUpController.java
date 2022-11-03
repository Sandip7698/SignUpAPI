package com.example.SpringProject.Controller;

import com.example.SpringProject.Model.SignUp;
import com.example.SpringProject.dto.SignUpdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    @GetMapping("/findByuserName/{userName}")
    public Optional<SignUp> getByUsername(@PathVariable("userName")String userName){
        return signUpServices.findByuserName(userName);
    }

    @GetMapping("/findByemail/{email}")
    public Optional<SignUp> getemail(@PathVariable ("email") String email){
        return signUpServices.findByemail(email);
    }

    @GetMapping("/findBycontact/{contact}")
    public Optional<SignUp> getBycontact(@PathVariable ("contact") Long contact){
        return signUpServices.findByContact(contact);
    }

    @DeleteMapping("/deleteByid/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable ("userId")Long userId){
        return signUpServices.deleteById(userId);
    }
    @GetMapping("/allUser")
    public List<SignUp> allinfo(){
        return signUpServices.allinfo();

    }
    @PutMapping("/update/{userId}")
    public ResponseEntity<String> updateData(@PathVariable ("userId")Long userId,@RequestBody SignUpdto signUpdto){
        return signUpServices.updatedata(userId,signUpdto);
    }
}
