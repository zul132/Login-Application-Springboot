package com.fathimazulaikha.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fathimazulaikha.test.domain.Login;
import com.fathimazulaikha.test.repository.LogRepo;

//Exception to catch incorrect passwords
class IncorrectPassword extends Exception {
    public IncorrectPassword(String s)
    {
        super(s);
    }
}

@Service
public class RegService {
    @Autowired
    private LogRepo userRepository;

    public void saveUser(String username, String password, String confirm)
    {
        try{
            if(password.equals(confirm)){
                Login user = new Login();
                user.setUsername(username);
                user.setPassword(password);
                userRepository.save(user);
            }else
                throw new IncorrectPassword("Error: Passwords don't match");
        }
        catch(IncorrectPassword ex){
            //print the error messsage
            System.out.println(ex.getMessage());
        }
    }
}
