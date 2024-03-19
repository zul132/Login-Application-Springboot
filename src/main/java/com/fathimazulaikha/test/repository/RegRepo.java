package com.fathimazulaikha.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fathimazulaikha.test.domain.Register;

@Repository
public interface RegRepo extends JpaRepository<Register,String>{
    //MODIFY THIS
    Register findByUsernameAndPassword(String username, String password);
}
