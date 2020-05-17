package uom.niroshan.myreditapp.service;

import org.springframework.stereotype.Service;
import uom.niroshan.myreditapp.dto.RegisterRequest;
import uom.niroshan.myreditapp.model.User;

import java.time.Instant;

@Service
public class AuthService {

    public void signup(RegisterRequest registerRequest){
        User user =new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        user.setCreated(Instant.now());
        user.setEnabled(false);
    }
}
