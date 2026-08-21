package com.security.SpringSecurity.StudentRepository;

import com.security.SpringSecurity.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {


    Users findByUsername(String username);
}
