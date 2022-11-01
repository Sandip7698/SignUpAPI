package com.example.SpringProject.ServiceImpl;

import com.example.SpringProject.Dao.signUpRepository;
import com.example.SpringProject.Model.SignUp;
import com.example.SpringProject.Sevice.signUpServices;
import com.example.SpringProject.dto.SignUpdto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.example.SpringProject.Dao.signUpRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SignUpServiceImpl implements signUpServices {
    @Autowired
    signUpRepository signUpRepository;

    @Override
    public ResponseEntity<String> saveinfo(SignUpdto signUpdto) {
        SignUp signUp=new SignUp();
        signUp.setFirstName(signUpdto.getFirstName());
        signUp.setLastName(signUpdto.getLastName());
        signUp.setUserName(signUpdto.getUserName());
        signUp.setPassword(signUpdto.getPassword());
        signUp.setEmail(signUpdto.getEmail());
        signUp.setDob(signUpdto.getDob());
        signUp.setContact(signUpdto.getContact());

        signUpRepository.save(signUp);

        return new ResponseEntity<>("200 SUCCESSFULL REGISTERED", HttpStatus.OK);
    }

    @Override
    public Optional<SignUp> getById(Long userId) {
        return signUpRepository.findById(userId);
    }


}
