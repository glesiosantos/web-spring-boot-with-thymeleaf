package br.com.glesioss.modelo.thymeleaf.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/autenticar")
    public String autenticar() {
        return "auth/sign-in";
    }
}
