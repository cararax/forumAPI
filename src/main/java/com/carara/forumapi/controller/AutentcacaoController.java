package com.carara.forumapi.controller;

import com.carara.forumapi.form.LoginForm;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AutentcacaoController {

    @PostMapping
    public ResponseEntity<?> autenticar(@RequestBody @Valid LoginForm form) {
        return ResponseEntity.ok().build();
    }
}
