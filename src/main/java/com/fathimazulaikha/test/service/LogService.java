package com.fathimazulaikha.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fathimazulaikha.test.domain.Login;
import com.fathimazulaikha.test.repository.LogRepo;

@Service
public class LogService {
    @Autowired
    private LogRepo rep;

    public Login log(String username, String password)
    {
        Login user = rep.findByUsernameAndPassword(username, password);
        return user;
    }
}
