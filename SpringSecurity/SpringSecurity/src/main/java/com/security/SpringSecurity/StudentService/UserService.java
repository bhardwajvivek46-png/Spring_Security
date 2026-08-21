package com.security.SpringSecurity.StudentService;

import com.security.SpringSecurity.Entity.Users;
import com.security.SpringSecurity.StudentRepository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo repo;

    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private JWTService jwtService;

    private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

    public Users register(Users user){

        user.setPassword(encoder.encode(user.getPassword()));
        return repo.save(user);
    }

    public List<Users> getAllUsers() {
        return repo.findAll();
    }

    public String verify(Users user) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        user.getUsername(), user.getPassword()
                )
        );

        if(authentication.isAuthenticated()) {
            return jwtService.generateToken(user.getUsername());
        }

        return "Fail";
    }
}
