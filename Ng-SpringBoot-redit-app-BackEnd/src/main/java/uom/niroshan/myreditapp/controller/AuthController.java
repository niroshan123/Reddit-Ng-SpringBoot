package uom.niroshan.myreditapp.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uom.niroshan.myreditapp.dto.AuthenticationResponse;
import uom.niroshan.myreditapp.dto.LoginRequest;
import uom.niroshan.myreditapp.dto.RegisterRequest;
import uom.niroshan.myreditapp.service.AuthService;

@RestController
@RequestMapping("/api/auth")
@AllArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public ResponseEntity<String> signup(@RequestBody RegisterRequest registerRequest) {

        authService.signup(registerRequest);
        return new ResponseEntity<>("User Ragistration Success", HttpStatus.OK);
    }

    @GetMapping("/accountVerification/{token}")
    public ResponseEntity<String> verifyAccount(@PathVariable String token) {
        authService.verifyAccount(token);
        return new ResponseEntity<>("Account Activated", HttpStatus.OK);

    }

    @PostMapping("/login")
    public AuthenticationResponse login(@RequestBody LoginRequest loginRequest){
        return authService.login(loginRequest);
//        return new ResponseEntity<>("Successfully Loged in", HttpStatus.OK);
    }
}
