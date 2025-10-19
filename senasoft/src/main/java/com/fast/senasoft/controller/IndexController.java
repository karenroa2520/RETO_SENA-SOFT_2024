package com.fast.senasoft.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.fast.senasoft.Service.UsuarioService;
import com.fast.senasoft.entity.Usuario;


@Controller
public class IndexController {

    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping("/principal")
    public String paginaPrincipalAlias() {
        return "pagina_principal";
    }
    
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("ingresar")
    public String ingresar(@RequestParam Long numeroIdentificacion,
                           @RequestParam Integer idTipoIdentificacion,
                           @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fechaNacimiento,
                           Model model) {

        List<Usuario> usuarios = usuarioService.obtenerUsuarioPorNumeroIdentificacion(numeroIdentificacion);

        if (usuarios == null || usuarios.isEmpty()) {
            model.addAttribute("error", "Usuario no encontrado");
            return "index";
        }

        Usuario usuarioEncontrado = usuarios.get(0);
        model.addAttribute("usuario", usuarioEncontrado);


        return "pagina_principal";
    }
    
    
}
