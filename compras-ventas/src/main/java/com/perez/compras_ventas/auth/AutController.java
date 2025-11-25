package com.perez.compras_ventas.auth;

import com.perez.compras_ventas.auth.dto.AuthRequest;
import com.perez.compras_ventas.auth.dto.AuthResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
@RequiredArgsConstructor
public class AutController {

    private final AuthService authService;

    @PostMapping
    public ResponseEntity<AuthResponse> authenticate(@RequestBody AuthRequest authRequest){

        return ResponseEntity.ok(authService.authentication(authRequest));
    }

    @PostMapping("/refresh-token")
    public ResponseEntity<AuthResponse> refreshToken(@RequestHeader String authentication){
        return ResponseEntity.ok(authService.refreshToken(authentication));
    }
}
