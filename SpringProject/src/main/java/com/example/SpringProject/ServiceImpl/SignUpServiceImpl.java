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
//        SignUp signUp=new SignUp();
//        signUp.setFirstName(signUpdto.getFirstName());
//        signUp.setLastName(signUpdto.getLastName());
//        signUp.setUserName(signUpdto.getUserName());
//        signUp.setPassword(signUpdto.getPassword());
//        signUp.setEmail(signUpdto.getEmail());
//        signUp.setDob(signUpdto.getDob());
//        signUp.setContact(signUpdto.getContact());
//
//        signUpRepository.save(signUp);
//
//        return new ResponseEntity<>("200 SUCCESSFULL REGISTERED", HttpStatus.OK);
//    }
        SignUp signUp=new SignUp();
        Optional<SignUp> firstname=signUpRepository.findByFirstName(signUpdto.getFirstName());
        Optional<SignUp> lastname=signUpRepository.findByLastName(signUpdto.getLastName());
        if(!firstname.isPresent() && !lastname.isPresent()) {
            signUp.setFirstName(signUpdto.getFirstName());
            signUp.setLastName(signUpdto.getLastName());

        }

        Optional<SignUp> username=signUpRepository.findByuserName(signUpdto.getUserName());
        if(!username.isPresent()) {

            signUp.setUserName(signUpdto.getUserName());

        }else {
            return new ResponseEntity<>("USERNAME ALREADY EXIST ",HttpStatus.OK);
        }


        Optional<SignUp> email=signUpRepository.findByemail(signUpdto.getEmail());
        if(!email.isPresent()) {
            signUp.setEmail(signUpdto.getEmail());
        }else {
            return new ResponseEntity<>("EMAIL ALREADY EXIST ",HttpStatus.OK);
        }

        Optional<SignUp> contact=signUpRepository.findByContact(signUpdto.getContact());
        if(!contact.isPresent()) {
            signUp.setContact(signUpdto.getContact());
        }
        signUp.setPassword(signUpdto.getPassword());
        signUp.setDob(signUpdto.getDob());

        signUpRepository.save(signUp);

        return new ResponseEntity<>("200 SUCCESSFULL REGISTERED",HttpStatus.OK);
    }

    @Override
    public Optional<SignUp> getById(Long userId) {
        return signUpRepository.findById(userId);
    }

    @Override
    public Optional<SignUp> getByfirstName(String firstName) {
        Optional<SignUp> optional=signUpRepository.getByfirstName(firstName);
        return optional;
    }

    @Override
    public Optional<SignUp> getBylastName(String lastName) {
        Optional<SignUp> optional=signUpRepository.findBylastName(lastName);
        return optional;
    }

    @Override
    public Optional<SignUp> findByuserName(String userName) {
        Optional<SignUp> optional=signUpRepository.findByuserName(userName);
        return optional;
    }

    @Override
    public Optional<SignUp> findByemail(String email) {
        Optional<SignUp> optional=signUpRepository.findByemail(email);
        return optional;
    }

    @Override
    public Optional<SignUp> findByContact(Long contact) {
        Optional<SignUp> optional=signUpRepository.findByContact(contact);
        return optional;
    }

    @Override
    public ResponseEntity<String> deleteById(Long userId) {
        signUpRepository.deleteById(userId);
        return new ResponseEntity<>("DELETE SUCCESSFULLY",HttpStatus.OK);
    }

    @Override
    public List<SignUp> allinfo() {
        List<SignUp> list=signUpRepository.findAll();
        return 	list;
    }

    @Override
    public ResponseEntity<String> updatedata(Long userId, SignUpdto signUpdto) {
        ResponseEntity<String> msg=new ResponseEntity<>(" ",HttpStatus.OK);
        Optional<SignUp> user=signUpRepository.findById(userId);
        if(user.isPresent()) {
            SignUp signUp=signUpRepository.getByuserId(userId);
            signUp.setFirstName(signUpdto.getFirstName());
            signUp.setLastName(signUpdto.getLastName());
            signUp.setDob(signUpdto.getDob());
            signUpRepository.save(signUp);
            msg=new ResponseEntity<>("Updated Sucessfully... ",HttpStatus.OK);

        }else {

            msg=new ResponseEntity<>("User Not Exist... ",HttpStatus.OK);
        }
        return msg;
    }




}
