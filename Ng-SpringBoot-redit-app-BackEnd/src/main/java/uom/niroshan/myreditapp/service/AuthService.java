package uom.niroshan.myreditapp.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import uom.niroshan.myreditapp.dto.RegisterRequest;
import uom.niroshan.myreditapp.model.User;
import uom.niroshan.myreditapp.model.VerificationToken;
import uom.niroshan.myreditapp.repository.UserRepository;

import java.time.Instant;
import java.util.UUID;


@AllArgsConstructor

@Service
public class AuthService {

//    @Autowired
//    private PasswordEncoder passwordEncoder;
//
//    @Autowired
//    private UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final   UserRepository userRepository;

    @Transactional
    public void signup(RegisterRequest registerRequest){
        User user =new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        user.setCreated(Instant.now());
        user.setEnabled(false);
        userRepository.save(user);

        generateVerificationToken(user);

    }

    public void generateVerificationToken(User user){
        String token =UUID.randomUUID().toString();
        VerificationToken verificationToken = new VerificationToken();
        verificationToken.setToken(token);
        verificationToken.setUser(user);


    }
}
