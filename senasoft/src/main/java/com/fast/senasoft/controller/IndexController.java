package com.fast.senasoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {

    
    @GetMapping("/principal")
    public String paginaPrincipalAlias() {
        return "pagina_principal";
    }
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
}
